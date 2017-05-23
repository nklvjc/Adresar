package adresar;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Osoba {
    private String ime;
    private String prezime;
    private int godina;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, int godina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godina = godina;
    }

    @Override
    public String toString() {
        return "Osoba{" + "ime=" + ime + ", prezime=" + prezime + ", godina=" + godina + '}';
    }
}