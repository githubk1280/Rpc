package com.test.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by
 * on 15/8/22.
 * Description:
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"config/dubbo-provider.xml"});
        context.start();

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
