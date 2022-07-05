package windows;

import entity.Cat;
import entity.Cow;
import entity.Dog;
import serviceImpl.AnimalServiceImpl;
import serviceImpl.ButtonServiceImpl;
import serviceImpl.MouseServiceImpl;

import javax.swing.*;
import java.awt.*;

public class SecondWindow extends JFrame{
    // Cat
    private JTextField inputCat = new JTextField(20);
    private JLabel labelCat = new JLabel("Cat");
    private JLabel labelCatInfo = new JLabel("");
    // Dog
    private JTextField inputDog = new JTextField(20);
    private JLabel labelDog = new JLabel("Dog");
    private JLabel labelDogInfo = new JLabel("");
    // Cow
    private JTextField inputCow = new JTextField(20);
    private JLabel labelCow = new JLabel("Cow");
    private JLabel labelCowInfo = new JLabel("");
    // Panels
    private JPanel mainPanel =  new JPanel();
    private JPanel catPanel =  new JPanel();
    private JPanel dogPanel =  new JPanel();
    private JPanel cowPanel =  new JPanel();
    // Objects Animal
    private Cat cat = new Cat();
    private Dog dog = new Dog();
    private Cow cow = new Cow();
    // Impl some methods
    private AnimalServiceImpl animalService = new AnimalServiceImpl();
    private MouseServiceImpl mouseService = new MouseServiceImpl();
    private ButtonServiceImpl buttonService = new ButtonServiceImpl();

    public SecondWindow() {
        setTitle("Second Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocation(400, 50);
        setLocationRelativeTo(null);
        setVisible(true);

        add(mainPanel);
        mainPanel.setVisible(true);
        // Cat
        catPanel.add(labelCat);
        catPanel.add(inputCat);
        catPanel.add(labelCatInfo);
        catPanel.setBackground(Color.lightGray);
        catPanel.setSize(300, 300);
        JButton button1 = new JButton("Cat");
        buttonService.buttonAction(button1, animalService, labelCat, inputCat, labelCatInfo);
        catPanel.add(button1);
        // Dog
        dogPanel.add(labelDog);
        dogPanel.add(inputDog);
        dogPanel.add(labelDogInfo);
        dogPanel.setBackground(Color.lightGray);
        dogPanel.setSize(300, 300);
        JButton button2 = new JButton("Dog");
        buttonService.buttonAction(button2, animalService, labelDog, inputDog, labelDogInfo);
        dogPanel.add(button2);
        // Cow
        cowPanel.add(labelCow);
        cowPanel.add(inputCow);
        cowPanel.add(labelCowInfo);
        cowPanel.setBackground(Color.lightGray);
        cowPanel.setSize(300, 300);
        JButton button3 = new JButton("Cow");
        buttonService.buttonAction(button3, animalService, labelCow, inputCow, labelCowInfo);
        cowPanel.add(button3);

        mainPanel.add(catPanel);
        mainPanel.add(dogPanel);
        mainPanel.add(cowPanel);

        add(mainPanel, BorderLayout.CENTER);

        mouseService.mouseCheck(catPanel);
        mouseService.mouseCheck(dogPanel);
        mouseService.mouseCheck(cowPanel);
    }
}