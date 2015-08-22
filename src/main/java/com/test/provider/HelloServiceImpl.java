package com.test.provider;

import org.springframework.stereotype.Service;

/**
 * Created by  on 15/8/22.
 * Description:
 */
@Service
public class HelloServiceImpl implements HelloService {
    public void sayHi(String msg) {
        System.out.println("hi " + msg);
    }
}
