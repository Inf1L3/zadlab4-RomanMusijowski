package pl.edu.ur.polab4;

public class Prostokat {
    float stronaMIn ;
    float stronaMax;

    public Prostokat(float stronaMIn, float stronaMax) {
        this.stronaMIn = stronaMIn;
        this.stronaMax = stronaMax;
    }

    public double poleProstokat(){
        return stronaMIn*stronaMax;
    }

    public void daneProstokat(){
        System.out.println("Mniejsza strona - "+this.stronaMIn);
        System.out.println("Wieksza strona - "+this.stronaMax);
        System.out.println("Pole - "+poleProstokat());
    }
}
