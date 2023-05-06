package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    String name;

    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
