package pl.edu.ur.polab4;

import static java.lang.Math.PI;

public class Kolo {
    float srednica;
    float promien;

    public Kolo(float srednica) {
        this.srednica = srednica;
        this.promien = srednica/2;
    }

    public double ObwodKolo(){
        return 2*PI *promien;
    }

    public double PoledKolo(){
        return PI *(promien*promien);
    }

    public void daneKolo(){
        System.out.println("Srednica - "+this.srednica);
        System.out.println("Promien - "+this.promien);
        System.out.println("Obwod koła - "+ObwodKolo());
        System.out.println("Pole koła - "+PoledKolo());
    }
}
