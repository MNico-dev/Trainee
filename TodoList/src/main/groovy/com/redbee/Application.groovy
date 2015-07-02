package com.redbee

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext

/**
 * Created by redbee on 01/07/15.
 */

@SpringBootApplication
class Application {

        public static void main(String[] args){
            ApplicationContext ctx = SpringApplication.run(Application.class, args);
            String []beanNames = ctx.getBeanDefinitionNames();

            Arrays.asList(beanNames).each{aBean -> println(aBean)};
        }
}
