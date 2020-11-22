/**
 * Latihan52
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Siapa Kamu
 */
public class mahasiswa extends manusia {
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void kelasApa(){
        System.out.println("Saya "+nama+" "+umur+" Tahun Sedang Belajar di kelas "+kelas );
    }

    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");   
    }
}
