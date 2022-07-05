package entity;

import entity.Animal;

public class Cow extends Animal {
    public Cow(String name, int age) {
        super(name, age);
    }
    public Cow() {

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
        if(str.equals("Muuu")){
            string = "I can say Muuu only";
        }else{
            string = "I can say only Muuu, but i don't understand what is " + str;
        }
        return string;
    }
    @Override
    public void eat() {

    }
}
