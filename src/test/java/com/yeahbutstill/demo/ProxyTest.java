package com.yeahbutstill.demo;

import com.yeahbutstill.demo.data.Cars;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    void testInvocationHandler() {

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                if (method.getName().equals("getName")) {
                    return "Car Proxy";
                } else if (method.getName().equals("run")) {
                    System.out.println("Car is running");
                }
                return null;
            }
        };

        // Create Proxy
        Cars car = (Cars) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{Cars.class},
                invocationHandler
        );

        System.out.println(car.getName());

        car.run();

    }
}
