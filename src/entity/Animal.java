package entity;

public abstract class Animal {
    
    private String name;
    private int age;

    public Animal(String name, int age) {
    }

    public Animal() {

    }

    public String sound(int number) {
        return null;
    }

    public String sound(String string) {
        return null;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
