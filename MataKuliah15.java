public class MataKuliah15 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks );
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS TELAH DIUBAH");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam < jam){
            System.out.println("Pengurangan tidak dapat dilakukan");
        }else{
            jumlahJam -= jam;
        }
    }

    public MataKuliah15(){

    }

    public MataKuliah15(String kode, String nm, int sks, int jumlah){
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jumlah;
    }
}