package entity;

import entity.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog() {

    }

    @Override
    public String sound(int number) {
        int sum = number + 10;
        String str = number + " + 10 = " + sum;
        return str;
    }

    @Override
    public String sound(String str) {
        String string;
        if(str.equals("Gav")){
            string = "I can say Gav only";
        }else{
            string = "I can say only Gav, but i don't understand what is " + str;
        }
        return string;
    }

    @Override
    public void eat() {

    }
}
