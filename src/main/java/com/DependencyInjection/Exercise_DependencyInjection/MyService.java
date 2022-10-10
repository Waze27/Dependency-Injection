package com.DependencyInjection.Exercise_DependencyInjection;


import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public String getName() {
        return myComponent.getMyComponentName();
    }

}
