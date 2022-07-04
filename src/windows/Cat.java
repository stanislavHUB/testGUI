package windows;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
        super();
    }

    @Override
    public String sound() {
        String string = "Meow";
        return string;
    }

    @Override
    public void eat() {

    }
}
