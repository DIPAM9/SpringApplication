package com.thinkxfactor.demoApp.entity;
import com.thinkxfactor.demoApp.entity.engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car
{
    private String name;
    @Autowired
    private engine eng;

    public car()
    {
        System.out.println("Car created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo()
    {
        System.out.println(this.name + this.eng.getModel());
    }
    
    
}
