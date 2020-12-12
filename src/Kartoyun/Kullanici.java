package Kartoyun;
import java.util.ArrayList;

public class Kullanici extends Oyuncu{
private ArrayList<Tenisci> tenisciDeste=new ArrayList<>();
private ArrayList<Basketbolcu> basketciDeste=new ArrayList<>();

    public Kullanici() {
         super(0, null ,0);
           this.basketciDeste=new ArrayList<Basketbolcu>();
          this.tenisciDeste=new ArrayList<Tenisci>(); 
         
              
             }

    public Kullanici(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
          this.basketciDeste=new ArrayList<Basketbolcu>();
          this.tenisciDeste=new ArrayList<Tenisci>(); 
         
      
    }

    public ArrayList<Tenisci> getTenisciDeste() {
        return tenisciDeste;
    }

    public void setTenisciDeste(ArrayList<Tenisci> tenisciDeste) {
        this.tenisciDeste = tenisciDeste;
    }

    public ArrayList<Basketbolcu> getBasketciDeste() {
        return basketciDeste;
    }

    public void setBasketciDeste(ArrayList<Basketbolcu> basketciDeste) {
        this.basketciDeste = basketciDeste;
    }

	@Override
	public boolean kartSec(int i) {
		return false;
		// TODO Auto-generated method stub
		
	}

    
}
