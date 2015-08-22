package com.test.consumer;

import com.test.provider.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by
 * on 15/8/22.
 * Description:
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "config/dubbo-consumer.xml" });
        context.start();

        HelloService helloService = (HelloService) context.getBean("helloService"); //
        helloService.sayHi("James");
        // System.out.println(demoService.hehe());
        System.in.read();
    }
}
