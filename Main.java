import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

public class Main {
    static Random random;
    static StringBuilder password;
    static String symbols;
    static String ints;
    static String lowercaseChars;
    static String uppercaseChars;
    static String wordHomie;

    public static void welcome() {
        System.out.println("Welcome To Password Generator 1.0");
        System.out.println("Generating Password...");
    }

    public static void variables() {
        Random random = new Random();
        password = new StringBuilder();
        symbols = "!@#$%^&*_-+=;:'<>/?";
        ints = "1234567890";
        lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public static void loop() {
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            int numberRandom = random.nextInt(1000);
            if (numberRandom < 250) {
                int symbolIndex = random.nextInt(symbols.length());
                char randoSymbo = symbols.charAt(symbolIndex);
                password.append(randoSymbo);
            } else if (numberRandom < 500) {
                int intIndex = random.nextInt(ints.length());
                char randoInt = ints.charAt(intIndex);
                password.append(randoInt);
            } else if (numberRandom < 750) {
                int lowerIndex = random.nextInt(lowercaseChars.length());
                char randoLower = lowercaseChars.charAt(lowerIndex);
                password.append(randoLower);
            } else if (numberRandom >= 750) {
                int upperIndex = random.nextInt(uppercaseChars.length());
                char randoUpper = uppercaseChars.charAt(upperIndex);
                password.append(randoUpper);
            }
        }
    }

    public static void box() {
        JFrame frame = new JFrame("Password Generator");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(5, 1));

        JPanel topPanel = new JPanel(new FlowLayout());
        JLabel label1 = new JLabel("Welcome to Password Generator", SwingConstants.CENTER);
        label1.setFont(new Font("Serif", Font.PLAIN, 24));
        topPanel.add(label1);
        mainPanel.add(topPanel);

        JPanel secondPanel = new JPanel(new FlowLayout());
        JLabel label2 = new JLabel("Password Length?", SwingConstants.CENTER);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        secondPanel.add(label2);
        mainPanel.add(secondPanel);

        JPanel sliderPanel = new JPanel(new FlowLayout());
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 6, 18, 6);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setPreferredSize(new Dimension(400, 50)); // Adjust the width and height as needed
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent e) {
                int passwordLength = slider.getValue();
                // Do something with the selected password length
            }
        });
            sliderPanel.add(slider);
            mainPanel.add(sliderPanel);

            JButton button = new JButton("Generate Password");
            button.addActionListener(e -> generatePassword());
            mainPanel.add(button);

            JTextField passwordField = new JTextField(20);
            passwordField.setEditable(false);
            mainPanel.add(passwordField);

            frame.add(mainPanel);
            frame.setLayout(new FlowLayout()); // Add this line to set the layout
            frame.setVisible(true);
        }

        public static void generatePassword() {
            // Implement your password generation logic here
            String wordHomie = "password";
        }
    

    public static void main(String[] args) {
        welcome();
        variables();
        loop();
        System.out.println("Generated Password: " + password.toString());
        box();
    }

}
