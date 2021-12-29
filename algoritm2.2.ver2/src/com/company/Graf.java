package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Graf {
    public List<Yzel>yselss;
    public List<Duga>dugass;
    public Graf(List<Yzel>yzels, List<Duga>dugas){
        this.yselss = yzels;
        this.dugass= dugas;
    }

    public int raskraska(){
        int paint = 1;
        int count=0;
        List<Yzel>sortYzels;
        sortYzels = yselss.stream().sorted((x,i)-> i.colonumber- x.colonumber).collect(Collectors.toList());
        show(sortYzels);
        while (count < sortYzels.size()){
            for (Yzel yzel: sortYzels) {
                if(yzel.color==0){
                    paint(yzel, paint, sortYzels);
                }
                else{
                    count++;
                }
            }
            paint++;
        }
        int rez=0;
        for (Yzel yzel: sortYzels) {
            if (yzel.color>rez){
                rez=yzel.color;
            }
        }
        return rez;
    }

    public void paint(Yzel yzel, int colour, List<Yzel>sortYzels){
        int cou=0;
        for (Duga duga: yzel.niebours) {
            if (duga.number==1){
                for (Yzel yzel1: sortYzels){
                    if (duga.to==yzel1.name){
                        if (yzel1.color != colour){
                            cou++;
                        }
                    }
                }
            }
        }
        if(cou== yzel.colonumber){
            yzel.color=colour;
        }
    }


    public void doGraf(){
        for (Yzel yzel:yselss) {
            for (Duga duga: dugass){
                if (duga.from==yzel.name){
                    yzel.niebours.add(new Duga(duga.from, duga.to,1));
                }
                if(duga.to == yzel.name){
                    yzel.niebours.add(new Duga(duga.to, duga.from,1));
                }
                else{
                    yzel.niebours.add(new Duga(duga.from, duga.to,0));
                }
            }
            yzel.counter();
        }
    }

    public void show (List<Yzel>yzels){
        for (Yzel yzel: yzels) {
            System.out.println(yzel.name+" colour "+ yzel.color + " сумма " + yzel.colonumber);
            for (Duga dug: yzel.niebours) {
                System.out.println("\tnumber "+ dug.number +" from "+dug.from+" to "+ dug.to );
            }
        }
        System.out.println("--------------------------------");
    }
}
