package pl.edu.ur.polab4;

public class Prostopadloscian {
    float stronaMin;
    float stronaMax;
    float wysokosc;

    public Prostopadloscian(float stronaMin, float stronaMax, float wysokosc) {
        this.stronaMin = stronaMin;
        this.stronaMax = stronaMax;
        this.wysokosc = wysokosc;
    }

    public double poleProstopadloscian(){
            return 2*(stronaMin*wysokosc+wysokosc*stronaMax+stronaMin*stronaMax);
    }

    public double objetoscProstopadloscian(){
        return stronaMax*stronaMin*wysokosc;
    }

    public void daneProstopadloscian(){
        System.out.println("Strona wieksza - "+this.stronaMax);
        System.out.println("Strona mniejsza - "+this.stronaMin);
        System.out.println("Pole - "+poleProstopadloscian());
        System.out.println("Objetosc - "+ objetoscProstopadloscian());
    }


}
