package serviceImpl;

import entity.Cat;
import entity.Cow;
import entity.Dog;
import service.AnimalService;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnimalServiceImpl implements AnimalService {

    Cat cat = new Cat();
    Dog dog = new Dog();
    Cow cow = new Cow();

    @Override
    public void inputChechk(JLabel labelAnimal, JTextField input, JLabel labelInfo) {
        Pattern pattern1 = Pattern.compile("[0-9]");
        Pattern pattern2 = Pattern.compile("[a-zA-Z]");
        Matcher matcher1 = pattern1.matcher(input.getText());
        Matcher matcher2 = pattern2.matcher(input.getText());
        if(matcher1.find()){
            int number = Integer.parseInt(input.getText());
            labelInfo.setText(cat.sound(number));
            labelInfo.setForeground(Color.BLACK);
        }else if(matcher2.find()){
            if(labelAnimal.getText() == "Cat"){
                labelInfo.setText(cat.sound(input.getText()));
                labelInfo.setForeground(Color.BLACK);
            }else if(labelAnimal.getText() == "Dog"){
                labelInfo.setText(dog.sound(input.getText()));
                labelInfo.setForeground(Color.BLACK);
            }else if(labelAnimal.getText() == "Cow"){
                labelInfo.setText(cow.sound(input.getText()));
                labelInfo.setForeground(Color.BLACK);
            }
        }else if(!matcher1.find() || !matcher2.find()){
            labelInfo.setText("Error!");
            labelInfo.setForeground(Color.RED);
        }
    }
}
