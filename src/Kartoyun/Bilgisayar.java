package Kartoyun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bilgisayar extends Oyuncu {

private ArrayList<Tenisci> tenisciDeste=new ArrayList<>();
private ArrayList<Basketbolcu> basketciDeste=new ArrayList<>();




    public Bilgisayar() {
         super(0, null, 0);
             this.basketciDeste=new ArrayList<Basketbolcu>();
          this.tenisciDeste=new ArrayList<Tenisci>(); 
     
        
    }

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int Skor) {
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

    public void setBasketciDeste(ArrayList<Basketbolcu> oyuncuB) {
        this.basketciDeste = oyuncuB;
    }
   
	@Override
	public boolean kartSec(int indis) {
		while(true) {
			
		if(tenisciDeste.get(indis).getSporcuIsim()=="Sharapova")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}
		if(tenisciDeste.get(indis).getSporcuIsim()=="Federer")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}
		if(tenisciDeste.get(indis).getSporcuIsim()=="Williams")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}
		if(tenisciDeste.get(indis).getSporcuIsim()=="Nadal")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}

		if(tenisciDeste.get(indis).getSporcuIsim()=="Dokovic")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}
		if(tenisciDeste.get(indis).getSporcuIsim()=="caglaBuyukakcay")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}
		if(tenisciDeste.get(indis).getSporcuIsim()=="ipekSoylu")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}
		if(tenisciDeste.get(indis).getSporcuIsim()=="hulyaAvsar")
		{
			if(tenisciDeste.get(indis).getKartKullanildiMi()==false)
			{
				tenisciDeste.get(indis).setKartKullanildiMi(true);
				return false;
			}
			else continue;
		}

	}
}
	
}
