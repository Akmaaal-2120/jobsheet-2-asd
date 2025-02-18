public class Dosen15 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        if(statusAktif){
            System.out.println("DOSEN INI AKTIF");
        }else{
            System.out.println("DOSEN INI TIDAK AKTIF");
        }
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg){
        thnSkrg -= tahunBergabung;
        System.out.println("\nLama Bekerja: " + thnSkrg + " Tahun");
        return thnSkrg;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

    public Dosen15(){

    }

    public Dosen15(String id, String nm, boolean sts, int thnGabung, String keahlian){
        idDosen = id;
        nama = nm;
        statusAktif = sts;
        tahunBergabung = thnGabung;
        bidangKeahlian = keahlian;
    }
}
