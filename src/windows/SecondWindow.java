package windows;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondWindow extends JFrame{
    private JTextField inputCat = new JTextField(20);
//    private JTextField inputCow = new JTextField(20);
//    private JTextField inputDog = new JTextField(20);
    private JLabel labelCat = new JLabel("Cat: ");
    private JLabel labelCatInfo = new JLabel("");
//    private JLabel labelDog = new JLabel("Dog: ");
//    private JLabel labelCow = new JLabel("Cow: ");
    private JPanel panel =  new JPanel();
    private Cat cat = new Cat();

//    public void paint(Graphics g) {
//        g.drawRect(30,100,300,300);
//        g.setColor(Color.GRAY);
//        g.drawRect(355,100,300,300);
//        g.setColor(Color.GRAY);
//        g.drawRect(680,100,300,300);
//        g.setColor(Color.GRAY);
//    }

    public void paint(Graphics graph0) {
        Graphics2D graph = (Graphics2D) graph0;
        graph.setColor(Color.LIGHT_GRAY);
        graph.draw(new Rectangle(30,100,300,300));
    }


    public SecondWindow() {
        setLayout(new BorderLayout(10,10));
        setTitle("Second Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocation(400, 50);
        setLocationRelativeTo(null);
        setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel); //JFrame
        panel.setVisible(true);
        panel.add(labelCat);
        panel.add(inputCat);
        panel.add(labelCatInfo);
        JButton button = new JButton("click");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern1 = Pattern.compile("[0-9]");
                Pattern pattern2 = Pattern.compile("[a-zA-Z]");
                Matcher matcher1 = pattern1.matcher(inputCat.getText());
                Matcher matcher2 = pattern2.matcher(inputCat.getText());
                if(matcher1.find()){
                    int number = Integer.parseInt(inputCat.getText());
                    labelCatInfo.setText(String.valueOf(number+10));
                }else if(matcher2.find()){
                    labelCatInfo.setText("I can say " + cat.sound() + " only!");
                }else if(!matcher1.find() || !matcher2.find()){
                    labelCatInfo.setText("Error!");
                }
            }
        });
        add(panel, BorderLayout.CENTER);

        inputCat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCatInfo.setText(inputCat.getText());
            }
        });



//        panel.add(labelDog);
//        panel.add(inputDog);
//        panel.add(labelCow);
//        panel.add(inputCow);

        // ===============================
//        JPanel animalPanel = new JPanel();
//        JLabel catLabel = new JLabel("Cat");
//        JLabel dogLabel = new JLabel("Dog");
//        JLabel cowLabel = new JLabel("Cow");
//        add(catLabel);
//        add(dogLabel);
//        add(cowLabel);
        // ================================





    }
}