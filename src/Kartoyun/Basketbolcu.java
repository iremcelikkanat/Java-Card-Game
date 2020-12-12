package Kartoyun;
public class Basketbolcu extends Sporcu {

    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private Boolean kartKullanildiMi;

    public Basketbolcu() {
          this.ikilik = 0;
        this.ucluk = 0;
        this.serbestAtis =0;
 
       
    }

    public Basketbolcu(int ikilik, int ucluk, int serbestAtis, String sporcuIsim, String sporcuTakim, int sporcuId) {
        super(sporcuIsim, sporcuTakim, sporcuId);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    
    }


    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public boolean getKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    @Override
    public void sporcuPuaniGoster() {
      
    }

    
}
