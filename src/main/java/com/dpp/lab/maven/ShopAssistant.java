package com.dpp.lab.maven;

import com.dpp.lab.maven.helpers.Advice;
import com.dpp.lab.maven.helpers.Meals;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.nodes.Tag;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ShopAssistant {

    private ArrayList<Advice> advicesArray = new ArrayList<Advice>();

    public ArrayList<Advice> getAdvicesArray() {
        return advicesArray;
    }

    public void setAdvicesArray(ArrayList<Advice> advicesArray) {
        this.advicesArray = advicesArray;
    }

    public ShopAssistant() {
        Yaml yaml = new Yaml();


//        advicesArray.add(new Advice(false,"kanapka", Meals.Breakfast, new ArrayList<String>(Arrays.asList("ad", "dsd"))));
//        advicesArray.add(new Advice(true,"bigos", Meals.Lunch, new ArrayList<String>(Arrays.asList("ad", "asdadadsa"))));
//
//        System.out.println(yaml.dump(advicesArray));

        File initialFile = new File("adviceList.yml");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(initialFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        advicesArray = yaml.load(inputStream);


    }

    public Advice GetRandom(){
        Random rnd = new Random();

        return advicesArray.get(rnd.nextInt() % advicesArray.size());
    }

    public static void main(String[] args){
        ShopAssistant sa = new ShopAssistant();

        for (Advice adv :
                sa.advicesArray) {
            System.out.println(adv.toString());
        }

    }

}
