package pl.edu.ur.polab4;

import static java.lang.Math.PI;

public class Kula {
    float srednica;
    float promien = srednica/2;

    public Kula(float srednica) {
        this.srednica = srednica;
        this.promien = srednica/2;
    }

    public double objetoscKula(){
        return 4*PI *promien;
    }

    public void daneKula(){
        System.out.println("Srednica - "+this.srednica);
        System.out.println("Promien - "+ this.promien);
        System.out.println("Objetosc - "+objetoscKula());
    }

}
