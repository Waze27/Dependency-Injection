package com.DependencyInjection.Exercise_DependencyInjection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController has been called!");
        this.myService = myService;
    }

    @GetMapping
    public String root(){
        return "Root!";
    }

    @GetMapping("/getName")
    public String getMyService() {
        System.out.println("getMyService has been called!");
        return myService.getName();
    }

}
