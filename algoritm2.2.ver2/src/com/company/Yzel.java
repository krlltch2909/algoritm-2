package com.company;

import java.util.ArrayList;
import java.util.List;

public class Yzel {
    public  int colonumber= 0;
    public String name;
    public int color =0;
    public List<Duga>niebours = new ArrayList();
    public Yzel(String name){
        this.name = name;
    }
    public void counter(){
        for (Duga duga:niebours){
            colonumber+=duga.number;
        }
    }
}
