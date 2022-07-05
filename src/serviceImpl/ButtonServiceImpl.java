package serviceImpl;

import service.ButtonService;
import serviceImpl.AnimalServiceImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonServiceImpl implements ButtonService {
    @Override
    public void buttonAction(JButton button, AnimalServiceImpl animalService, JLabel label, JTextField input, JLabel labelInfo) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animalService.inputChechk(label, input, labelInfo);
            }
        });
    }
}
