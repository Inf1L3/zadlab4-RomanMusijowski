package pl.edu.ur.polab4;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int indeks = 0;
        String odpowiedz = null;
        String imie = null;
        String nazwisko = null;
        int wiek = 0;
        int nr_indeks = 0;
        String nazwa_specjalności = null;
        int rok_studiow = 0;
        float stronaMin, stronaMax, wysokosc, srednica, rebro;
        int wybor;
//
//        System.out.println("Podaj imie");
//        imie = scanner.nextLine();

//        System.out.println("Podaj nazwisko");
//        nazwisko = scanner.nextLine();

//        System.out.println("Podaj wiek");
//        wiek = scanner.nextInt();

//        System.out.println("Podaj nr_indeks");
//        nr_indeks = scanner.nextInt();

//        System.out.println("Podaj nazwa_specjalności");
//        nazwa_specjalności = scanner.nextLine();
//        nazwa_specjalności = scanner.nextLine();

//        System.out.println("Podaj rok_studiow");
//        rok_studiow = scanner.nextInt();
//
//
//        Student stud = new Student( imie,  nazwisko,  wiek,  nr_indeks,  nazwa_specjalności,  rok_studiow);
//        stud.pokazDane();
//


        //Zadanie 4


        System.out.println("Zadanie 4 ");


//        Kolo krug = new Kolo(3);
//        krug.daneKolo();
//
//        Stozek  stoz = new Stozek(3,2,5);
//        stoz.daneStozek();
//
//        Kwadrat kwadrat = new Kwadrat(5);
//        krug.daneKolo();
//
//        Prostokat prost = new Prostokat(5,9);
//        prost.daneProstokat();
//
//        Szescian szesc = new Szescian(3);
//        szesc.daneSzescian();
//
//        Prostopadloscian prostopadloscian = new Prostopadloscian(3,6,9);
//        prostopadloscian.daneProstopadloscian();
//
//        Kula kul = new Kula(4);
//        kul.daneKula();


        //KALKULATOR
//
//
        System.out.println("~~~~~~~MENU~~~~~~~~");
        System.out.println("1. KOLO ~~~~~~~~~~~");
        System.out.println("2. STOZEK ~~~~~~~~~");
        System.out.println("3. KWADRAT ~~~~~~~~");
        System.out.println("4. PROSTOKAT ~~~~~~");
        System.out.println("5. SZESCIAN ~~~~~~~");
        System.out.println("6. PROSTOPADLOSCIAN ");
        System.out.println("7. KULA ~~~~~~~~~~~~");
        System.out.println("Co chcesz policzyc?");
        wybor = scanner.nextInt();

        switch (wybor){
            case 1:
                    System.out.println("Podaj dlugosc srednicy");
                    srednica = scanner.nextFloat();

                    Kolo kolo = new Kolo(srednica);
                    kolo.daneKolo();
                break;

            case 2:
                    System.out.println("Podaj dlugosc srednicy");
                    srednica = scanner.nextFloat();
                    System.out.println("Podaj wysokosc");
                    wysokosc = scanner.nextFloat();
                    System.out.println("Podaj rebro");
                    rebro = scanner.nextFloat();

                    Stozek  stozek = new Stozek(wysokosc,srednica, rebro);
                    stozek.daneStozek();
                break;

            case 3:
                    System.out.println("Podaj strone - ");
                    stronaMin =scanner.nextFloat();

                    Kwadrat kwadrat1 = new Kwadrat(stronaMin);
                    kwadrat1.daneKwadrat();
                break;

            case 4:
                    System.out.println("Podaj strone min -  ");
                    stronaMin =scanner.nextFloat();
                    System.out.println("Podaj strone min -  ");
                    stronaMax=scanner.nextFloat();

                    Prostokat prostokat = new Prostokat(stronaMin,stronaMax);
                    prostokat.daneProstokat();
                break;

            case 5:
                    System.out.println("Podaj strone -");
                    stronaMin = scanner.nextFloat();

                    Szescian szescian = new Szescian(stronaMin);
                    szescian.daneSzescian();
                break;

            case 6:
                    System.out.println("Podaj strone min -  ");
                    stronaMin =scanner.nextFloat();
                    System.out.println("Podaj strone max -  ");
                    stronaMax =scanner.nextFloat();
                    System.out.println("Podaj wysokosc -  ");
                    wysokosc =scanner.nextFloat();

                    Prostopadloscian prostopadlos = new Prostopadloscian(stronaMin,stronaMax,wysokosc);
                    prostopadlos.daneProstopadloscian();
                break;

            case 7:
                    System.out.println("Podaj srednice - ");
                    srednica=scanner.nextFloat();

                    Kula kula = new Kula(srednica);
                    kula.daneKula();
                break;

            default:
                System.out.println("Nie ma takiego ");
                break;
        }



        //ZADANIE 5


        Student[] uniwer = new Student[100];

        for (int i = 0; i < 100; i++) {
            uniwer[i] = new Student("", "", 0, 0, "", 0);
        }

        do {
            System.out.println("Chcesz podac dane studenta?");
            wybor = scanner.nextInt();
            switch (wybor) {
                case 1:

                    System.out.println("Podaj indeks studenta dla podania danych ");
                    indeks = scanner.nextInt();

                    System.out.println("Podaj imie");
                    imie = scanner.nextLine();
                    imie = scanner.nextLine();

                    System.out.println("Podaj nazwisko");
                    nazwisko = scanner.nextLine();

                    System.out.println("Podaj wiek");
                    wiek = scanner.nextInt();

                    System.out.println("Podaj nr_indeks");
                    nr_indeks = scanner.nextInt();

                    System.out.println("Podaj nazwa_specjalności");
                    nazwa_specjalności = scanner.nextLine();
                    nazwa_specjalności = scanner.nextLine();

                    System.out.println("Podaj rok_studiow");
                    rok_studiow = scanner.nextInt();

                    uniwer[indeks].podajDane(imie, nazwisko, wiek, nr_indeks, nazwa_specjalności, rok_studiow);

                    System.out.println("Podac jeszcze dane (Y or N)");
                    odpowiedz = scanner.nextLine();
                    odpowiedz = scanner.nextLine();
                break;

                default:
                    System.out.println("Niepoprawne znaczenie");
                break;
            }

            System.out.println("Podac jeszcze dane (Y or N)");
            odpowiedz = scanner.nextLine();
            odpowiedz = scanner.nextLine();

        }while (odpowiedz == "Y") ;



    }
}