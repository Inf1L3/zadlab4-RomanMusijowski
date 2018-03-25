package pl.edu.ur.polab4;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String imie = null ;
        String nazwisko = null;
        int wiek = 0;
        int nr_indeks = 0 ;
        String nazwa_specjalności= null;
        int rok_studiow = 0;

        System.out.println("Podaj imie");
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


        Student stud = new Student( imie,  nazwisko,  wiek,  nr_indeks,  nazwa_specjalności,  rok_studiow);
        stud.pokazDane();


        //Zadanie 4
        System.out.println("Zadanie 4 ");




    }

}
