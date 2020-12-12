package Kartoyun;
public class Tenisci extends Sporcu {

    private int servis;
    private int forhand;
    private int backhand;
    private Boolean kartKullanildiMi=false;

    public Tenisci() {
         this.servis = 0;
        this.forhand = 0;
        this.backhand = 0;
        this.kartKullanildiMi=false;
     

    }

    public Tenisci(int servis, int forhand, int backhand,String sporcuIsim, String sporcuTakim, int sporcuId,Boolean kartKullanildiMi) {
        super(sporcuIsim, sporcuTakim, sporcuId);
        this.servis = servis;
        this.forhand = forhand;
        this.backhand = backhand;
        this.kartKullanildiMi=kartKullanildiMi;
      
    }



    public int getServis() {
        return servis;
    }

    public void setServis(int servis) {
        this.servis = servis;
    }

    public int getForhand() {
        return forhand;
    }

    public void setForhand(int forhand) {
        this.forhand = forhand;
    }

    public int getBackhand() {
        return backhand;
    }

    public void setBackhand(int backhand) {
        this.backhand = backhand;
    }
    public Boolean getKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(Boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
   
    }
    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
