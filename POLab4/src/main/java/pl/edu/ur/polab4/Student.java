package pl.edu.ur.polab4;

public class Student {
    public String imie;
    public String nazwisko;
    public int wiek;
    public int nr_indeks;
    public String nazwa_specjalności;
    public int rok_studiow;

    public Student(String imie, String nazwisko, int wiek, int nr_indeks, String nazwa_specjalności, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalności = nazwa_specjalności;
        this.rok_studiow = rok_studiow;
    }



    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student() {
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getNr_indeks() {
        return nr_indeks;
    }

    public void setNr_indeks(int nr_indeks) {
        this.nr_indeks = nr_indeks;
    }

    public String getNazwa_specjalności() {
        return nazwa_specjalności;
    }

    public void setNazwa_specjalności(String nazwa_specjalności) {
        this.nazwa_specjalności = nazwa_specjalności;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }



    public void pokazDane() {
        System.out.println("Student");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
        System.out.println("nr_indeks: " + this.nr_indeks );
        System.out.println("nazwa_specjalności : " + this.nazwa_specjalności + " lat");
        System.out.println("rok_studiow: " + this.rok_studiow + " lat");
    }
    //postgres
    //jarki
    //soup
    //mvnrepository.com


}
