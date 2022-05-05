package com.company.springboot;

import com.company.springboot.bean.Pet;
import com.company.springboot.bean.User;
import com.company.springboot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author wlb10
 * @PackageName boot-01-helloworld
 * @Package com.company.springboot.boot
 * @Date 2022/4/27 16:29
 * @Version 1.0
 */
@SpringBootApplication  //这是一个springboot应用，这是主程序类
public class MainApplication {
    public static void main(String[] args) {
        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2.查看容器的内容
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println(name);
        }
        //3.从容器中获取组件
        Pet pet01 = run.getBean("tom",Pet.class);
        Pet pet02 = run.getBean("tom",Pet.class);
        System.out.println(pet01 + "   " + pet02 + "   " + (pet02==pet01));
        //4.MyConfig com.company.springboot.config.MyConfig$$EnhancerBySpringCGLIB$$f4c29dda@44b194fe
        MyConfig myConfig = run.getBean(MyConfig.class);
        System.out.println(myConfig);
        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法springBoot总会检查这个组件是否在容器中有，保持组件单实例。
        User user01 = myConfig.user01();
        User user02 = myConfig.user01();
        System.out.println(user01 == user02);

        //
        User user001 = run.getBean("user01", User.class);
        Pet pet001 = run.getBean("tom",Pet.class);
        System.out.println("用户的宠物：" + (user001.getPet() == pet001));
    }
}
