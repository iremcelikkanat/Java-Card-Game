package Kartoyun;
import java.awt.*;
import java.util.ArrayList;

public abstract class Oyuncu {

    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;
	private Basketbolcu kartListesi;


    public Oyuncu() {
        this.oyuncuID = 0;
        this.oyuncuAdi = null;
        this.Skor = 0;
 
    }

    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
   
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }


    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

    public ArrayList<Sporcu> getKartListesi() {
        return getKartListesi();
    }

    public void setKartListesi(Basketbolcu basketbolcu) {
        this.kartListesi = basketbolcu;
    }


    public void skorGoster() {
        
  
		
    }

   public abstract boolean kartSec(int i);



}
