package com.dpp.app;

import com.dpp.lab.maven.ShopAssistant;
import com.dpp.lab.maven.helpers.Advice;

import javax.swing.*;

public class App {
    private ShopAssistant sa = new ShopAssistant();

    private JButton button1;
    private JPanel panel1;

    public App(){
        for (Advice adv :
                sa.getAdvicesArray()) {
            System.out.println(adv.toString());
        }
    }



    public static void main(String[] args){
        new App();
    }
}
