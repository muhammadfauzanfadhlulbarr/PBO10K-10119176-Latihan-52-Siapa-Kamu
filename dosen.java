/**
 * Latihan52
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Siapa Kamu
 */
public class dosen extends manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        
        System.out.println("Saya "+nama+ " umur " +umur+ " tahun sedang mengajar matakuliah " +mataKuliah);
    }
    
    public void siapaKamu(){
        
        System.out.println("Saya Dosen");
    }
}
