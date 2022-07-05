package entity;

import entity.Animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat() {
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
        if(str.equals("Meow")){
            string = "I can say Meow only";
        }else{
            string = "I can say only Meow, but i don't understand what is " + str;
        }
        return string;
    }

    @Override
    public void eat() {

    }
}
