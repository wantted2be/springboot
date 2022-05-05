package com.company.springboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.company.springboot.bean.Pet;
import com.company.springboot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author wlb10
 * @PackageName boot-01-helloworld
 * @Package com.company.springboot.config
 * @Date 2022/4/28 10:11
 * @Version 1.0
 */

/**
 * 本节重点@Configuration @Bean
 *  3、proxyBeanMethods：代理bean的方法
 *       Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *       Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *       组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *  4、@Import({User.class, DBHelper.class})
 *       给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 */
@Import(value = {User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false)  //配置类 ,proxyBeanMethods代理bean的方法
public class MyConfig {
    @Bean  //给容器添加组件。以方法名作为组件的id。返回类型就是组件类型。返回值就是组件在容器中保存的实例。
    public User user01(){
        User user = new User("lisa",18);
        user.setPet(cat());  //用户组件依赖了宠物组件
        return user;
    }
    @Bean(value = "tom")  //可以使用value给组件重新命名
    public Pet cat(){
        return new Pet("cat");
    }
}
