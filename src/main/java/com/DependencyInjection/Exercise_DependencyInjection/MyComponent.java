package com.DependencyInjection.Exercise_DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

     public String myComponentName;

    MyComponent(){
        this.myComponentName = "SH45-T";
    }

    public String getMyComponentName(){
        return myComponentName;
    }

}
