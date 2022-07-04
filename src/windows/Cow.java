package windows;

public class Cow extends Animal{

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public String sound() {
        String string = "Muuu";
        return string;
    }

    @Override
    public void eat() {

    }
}
