/**
 * Latihan52
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Siapa Kamu
 */
public class PBO10k10119176Latihan52 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dosen dsn = new dosen();
        dsn.setNip("41227829930");
        dsn.setNama("Rizki Adam Kurniawan");
        dsn.setMataKuliah("PBO");
        dsn.setUmur(27);
        System.out.println("NIP DOSEN : " +dsn.getNip());
        dsn.siapaKamu();
        dsn.mengajarApa();
        
        System.out.println("");
        
        mahasiswa mhs = new mahasiswa();
        mhs.setNim("10119176");
        mhs.setNama("Muhammad Fauzan Fadhlulbarr");
        mhs.setKelas("PBO10k");
        mhs.setUmur(20);
        System.out.println("NIM MAHASISWA : "+ mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa(); 
        
    }
}
