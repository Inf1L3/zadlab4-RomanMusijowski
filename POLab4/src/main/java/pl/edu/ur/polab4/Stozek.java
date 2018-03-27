package pl.edu.ur.polab4;

import static java.lang.Math.PI;

public class Stozek {
    float wysokosc ;
    float srednica;
    float promien ;
    float rebro;

    public Stozek(float wysokosc, float srednica, float rebro) {
        this.wysokosc = wysokosc;
        this.srednica = srednica;
        this.promien = srednica/2;
        this.rebro = rebro;
    }

    public double PolePodstawyStozek(){
        return PI*(promien*promien);
    }



    public double PolePowierchniStozek(){
        return PI*(promien*promien);
    }

    public double ObjetoscStozek(){
        return (PI*(promien*promien)*wysokosc)/3;
    }

    public void daneStozek(){
        System.out.println("Srednica - "+this.srednica);
        System.out.println("Promien - "+this.promien);
        System.out.println("Rero - "+this.rebro);
        System.out.println("Wysokosc - "+this.wysokosc);
        System.out.println("Pole podstawy - "+PolePodstawyStozek());
        System.out.println("Objetosc Stozek - "+ObjetoscStozek());
        System.out.println("Powierchna Stozek - "+PolePowierchniStozek());
    }

}
