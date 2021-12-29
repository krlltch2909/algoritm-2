package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Yzel> uzels = new ArrayList<>();

        uzels.add(new Yzel("a"));
        uzels.add(new Yzel("b"));
        uzels.add(new Yzel("c"));
        uzels.add(new Yzel("d"));
        uzels.add(new Yzel("e"));
        uzels.add(new Yzel("f"));
        uzels.add(new Yzel("g"));


        List<Duga> dugas = new ArrayList<>();
        dugas.add(new Duga("a","b",0));
        dugas.add(new Duga("b","c",0));
        dugas.add(new Duga("b","d",0));
        dugas.add(new Duga("d","e",0));
        dugas.add(new Duga("c","e",0));
        dugas.add(new Duga("c","f",0));
        dugas.add(new Duga("f","e",0));
        dugas.add(new Duga("f","g",0));
        dugas.add(new Duga("g","e",0));


        Graf graf = new Graf(uzels, dugas);

        graf.doGraf();

        System.out.println("\u001B[36m"+"Неотсортированный вершины граффа с  информацей о соседях"+"\u001B[0m");
        graf.show(graf.yselss);

        System.out.println("\u001B[36m"+"Отсортированный вершины граффа с  информацей о соседях"+"\u001B[0m");

        System.out.println("\u001B[31m"+"количество цветов "+((graf.raskraska())+"\u001B[0m"));
        System.out.println("----------------------------------");

        // второй граф не обязательно
       /*List<Yzel> uzels1 = new ArrayList<>();

        uzels1.add(new Yzel("a"));
        uzels1.add(new Yzel("b"));
        uzels1.add(new Yzel("c"));
        uzels1.add(new Yzel("d"));
        uzels1.add(new Yzel("e"));

        List<Duga> dugas1 = new ArrayList<>();
        dugas1.add(new Duga("a","b",0));
        dugas1.add(new Duga("a","d",0));
        dugas1.add(new Duga("d","e",0));
        dugas1.add(new Duga("a","c",0));
        dugas1.add(new Duga("c","e",0));

        Graf graf1 = new Graf(uzels1,dugas1);

        graf1.doGraf();
       // graf1.show(uzels1);

        System.out.println("\u001B[31m"+"количество цветов "+(graf1.raskraska())+"\u001B[0m");
        System.out.println("----------------------------------");*/
    }
}