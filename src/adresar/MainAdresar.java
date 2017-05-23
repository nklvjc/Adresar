package adresar;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAdresar {

    public static void main(String[] args) {
        Osoba[] nizOsoba = new Osoba[10];
        int brojOsoba = 0;
        char izlaz2 = 'D';
        while(izlaz2 != 'N'){
            
        System.out.println("Glavni meni");
        System.out.println("Opcija 1 - Unesi osobu");
        System.out.println("Opcija 2 - Prikazi osobu");
        System.out.println("Opcija 0 - Izlaz");
        int ulaz;
        Scanner in = new Scanner(System.in);
        ulaz = in.nextInt();
        char izlaz = 'D';
        switch (ulaz) {
            case 0:
                System.exit(0);
                break;
            case 1:
                while (izlaz != 'N') {

                    System.out.println("Unesi ime:");
                    String ime = in.next();
                    System.out.println("Unesi prezime:");
                    String prezime = in.next();
                    System.out.println("Unesi broj godina:");
                    int godina = in.nextInt();

                    Osoba o = new Osoba(ime, prezime, godina);
                    nizOsoba[brojOsoba] = o;
                    brojOsoba++;

                    System.out.println("Uneli ste: " + o.toString() + "\n");
                    System.out.println("Da li zelite da unesete jos jednu osobu (D/N)");
                    izlaz = in.next().charAt(0);
                }
                break;
            case 2:
                System.out.println("Unesi indeks osobe: ");
                int indeks = in.nextInt();
                System.out.println(nizOsoba[indeks]);
                break;
            default:
                System.out.println("Pogresan ulaz");
               
        }
         System.out.println("Da li zelite da se vratite u glavni meni (D/N)");
         izlaz2 = in.next().charAt(0);
        }
    }
}
    

