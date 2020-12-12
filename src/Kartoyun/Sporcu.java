package Kartoyun;
public class Sporcu {

    private String sporcuIsim;
    private String sporcuTakim;
    private int sporcuId;

    public Sporcu() {
        this.sporcuIsim = null;
        this.sporcuTakim = null;
        this.sporcuId = 0;
    }

    public Sporcu(String sporcuIsim, String sporcuTakim, int sporcuId) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
        this.sporcuId = sporcuId;
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public int getSporcuId() {
        return sporcuId;
    }

    public void setSporcuId(int sporcuId) {
        this.sporcuId = sporcuId;
    }

    public void sporcuPuaniGoster() {

    }

}
