package service;

import serviceImpl.AnimalServiceImpl;

import javax.swing.*;

public interface ButtonService {

    public void buttonAction(JButton button, AnimalServiceImpl animalService, JLabel label, JTextField input, JLabel labelInfo);

}
