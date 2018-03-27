package pl.edu.ur.polab4;

import static java.lang.StrictMath.sqrt;

public class Kwadrat {
    float strona;
    double d = 2*sqrt(2);

    public Kwadrat(float strona) {
        this.strona = strona;
    }

    public double poleKwadratu(){
        return (strona*strona);
    }

    public double okragOpisany(){
        return d/2;
    }

    public void daneKwadrat(){
        System.out.println("Strona - "+this.strona);
        System.out.println("Pole Kwadratu - "+poleKwadratu());
        System.out.println("Okrag Opisany - "+okragOpisany());
    }
}
