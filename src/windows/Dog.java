package windows;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sound() {
        String string = "Gav";
        return string;
    }

    @Override
    public void eat() {

    }
}
