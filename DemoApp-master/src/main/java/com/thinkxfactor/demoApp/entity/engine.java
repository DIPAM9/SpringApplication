package com.thinkxfactor.demoApp.entity;
import org.springframework.stereotype.Component;

@Component

public class engine{
    private String model="12345";
    public engine()
    {
        System.out.println("Engine Created");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    

}