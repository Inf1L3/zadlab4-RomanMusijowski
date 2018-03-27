package pl.edu.ur.polab4;

public class Szescian {
    float strona;

    public Szescian(float strona) {
        this.strona = strona;
    }

    public float objetoscSzescian(){
        return (strona*strona*strona);
    }

    public float poleSzescian(){
        return 6*(strona*strona);
    }

    public void daneSzescian(){
        System.out.println("Strona - "+this.strona);
        System.out.println("Objetosc - "+objetoscSzescian());
        System.out.println("Pole - "+poleSzescian());
    }

}
