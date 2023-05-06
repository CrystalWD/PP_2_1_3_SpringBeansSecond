package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal dog;
    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
    public Timer getTimer(){
        return this.timer;
    }
}
