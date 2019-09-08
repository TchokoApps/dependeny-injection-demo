package com.tchokoapps.springboot.dependenyinjectiondemo;

import com.tchokoapps.springboot.dependenyinjectiondemo.controllers.MyController;
import com.tchokoapps.springboot.dependenyinjectiondemo.examplebeans.FakeDataSource;
import com.tchokoapps.springboot.dependenyinjectiondemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependenyInjectionDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DependenyInjectionDemoApplication.class, args);
        MyController myController = ctx.getBean(MyController.class);
        myController.sayHello();

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("fakeDataSource = " + fakeDataSource);

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println("fakeJmsBroker = " + fakeJmsBroker);
    }

}
