package adresar;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAdresar {

    public static void main(String[] args) {
        ArrayList nizOsoba = new ArrayList();
        int brojOsoba = 0;
        char izlaz2 = 'D';
        while(izlaz2 != 'N'){
            
        System.out.println("Glavni meni");
        System.out.println("Opcija 1 - Unesi osobu");
        System.out.println("Opcija 2 - Prikazi osobu");
        System.out.println("Opcija 3 - Izmeni osobu");
        System.out.println("Opcija 4 - Izbrisi osobu");
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
                    nizOsoba.add(o);

                    System.out.println("Uneli ste: " + o.toString() + "\n");
                    System.out.println("Da li zelite da unesete jos jednu osobu (D/N)");
                    izlaz = in.next().charAt(0);
                }
                break;
            case 2:
                System.out.println("Unesi indeks osobe: ");
                int indeks = in.nextInt();
                System.out.println(nizOsoba.get(indeks));
                break;
            case 3:
                System.out.println("Unesite indeks osobe koja se menja: ");
                int indeks3 = in.nextInt();
                System.out.println("Unesi ime:");
                String ime3 = in.next();
                System.out.println("Unesi prezime:");
                String prezime3 = in.next();
                System.out.println("Unesi broj godina:");
                int godina3 = in.nextInt();
                nizOsoba.remove(indeks3);
                nizOsoba.add(indeks3, new Osoba(ime3, prezime3, godina3));
                
                break;
            case 4:
                System.out.println("Unesite indeks osobe koja se brise: ");
                int indeks4 = in.nextInt();
                nizOsoba.remove(indeks4);
                break;
                
            default:
                System.out.println("Pogresan ulaz");
               
        }
         System.out.println("Da li zelite da se vratite u glavni meni (D/N)");
         izlaz2 = in.next().charAt(0);
        }
    }
}
    

