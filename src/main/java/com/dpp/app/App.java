package com.dpp.app;

import com.dpp.lab.maven.ShopAssistant;
import com.dpp.lab.maven.helpers.Advice;
import com.dpp.lab.maven.helpers.Meals;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JPanel {
    private ShopAssistant sa = new ShopAssistant();

    private Meals mealtype = Meals.Breakfast;
    private boolean veg = false;

    private JButton getAdviceButton;
    private JButton getRandomAdviceButton;
    private JCheckBox vegetarianCheckBox;
    private JComboBox comboBox1;
    private JLabel vegetarian;
    private JLabel mealType;

    public App(){
//        for (Advice adv :
//                sa.getAdvicesArray()) {
//            System.out.println(adv.toString());
//        }

        JFrame window = new JFrame("Shop Advice App");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(300, 200, 300, 200);
        window.setResizable(false);

        vegetarian = new JLabel("vegetarian");
        mealType = new JLabel("Type of meal");
        comboBox1 = new JComboBox();
        comboBox1.setModel(new DefaultComboBoxModel(Meals.values()));
        vegetarianCheckBox = new JCheckBox();
        getAdviceButton = new JButton("Get Advice");
        getRandomAdviceButton = new JButton("Get Random Advice");

        getAdviceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                veg = vegetarianCheckBox.isSelected();

                if (Meals.Breakfast.toString().equals(comboBox1.getSelectedItem().toString())) {
                    mealtype = Meals.Breakfast;
                } else if (Meals.Lunch.toString().equals(comboBox1.getSelectedItem().toString())) {
                    mealtype = Meals.Lunch;
                } else if (Meals.Dinner.toString().equals(comboBox1.getSelectedItem().toString())){
                    mealtype = Meals.Dinner;
                } else if(Meals.All.toString().equals(comboBox1.getSelectedItem().toString())){
                    mealtype = Meals.All;
                }else{
                    JOptionPane.showMessageDialog(null,"error 2");
                    return;
                }

                Advice a = sa.getSpecific(veg,mealtype);

                if (a==null){
                    JOptionPane.showMessageDialog(null,"Brak propozycji dla danych");
                    return;
                }

                JOptionPane.showMessageDialog(null,a.toString());
            }
        });

        getRandomAdviceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,sa.getRandom().toString());
            }
        });

        add(vegetarian);
        add(vegetarianCheckBox);
        add(mealType);
        add(comboBox1);
        add(getRandomAdviceButton);
        add(getAdviceButton);
        window.getContentPane().add(this);
        window.setVisible(true);
    }



    public static void main(String[] args){

        App app = new App();

    }
}
