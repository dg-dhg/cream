package net.dhg.crm.modelling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OCP {
    public static void main(String[] args) {
        Zoo zoo=new Zoo();

        zoo.zoo.add(new Fish());
        zoo.zoo.add(new Bird());
        zoo.display();
    }

}

class Zoo {
    List<Animal> zoo = new ArrayList<>();


    Zoo() {
    }
    void display(){
        Iterator<Animal> it=zoo.iterator();
        while (it.hasNext()){
            it.next().running();
        }
    }

}

abstract class Animal {
    String name ="";
    abstract void running();
}


class Fish extends  Animal{
    Fish(){
        name="fish";
    }
    @Override
    void running() {
        System.out.println(String.format("%s is swimming in the sea",name));
    }
}
class Bird extends  Animal{
    Bird(){
        name="bird";
    }
    @Override
    void running() {
        System.out.println(String.format("%s is flying in the sky",name));
    }
}