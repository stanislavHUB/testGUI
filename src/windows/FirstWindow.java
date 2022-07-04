package windows;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindow extends JFrame {
    FirstWindow(){
        JFrame frame = new JFrame();
        setTitle("First Window");
        JButton button = new JButton("click on me");
        button.setBounds(130, 150, 115, 50);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SecondWindow();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(50,50);
        setLayout(null);
        setVisible(true);
    }
}
