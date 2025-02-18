public class DosenMain15 {
    public static void main(String[] args) {
        
        Dosen15 dsn1 = new Dosen15();
        dsn1.idDosen = "PYS";
        dsn1.nama = "Pramana Yoga Saputra";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2014;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Dasar Pemrograman");
        dsn1.tampilInformasi();

        System.out.println("----------------------------");

        Dosen15 dsn2 = new Dosen15("HP", "Hendra Pradibta", false, 1998, "Bisnis");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Dasar Pemrograman");
        dsn2.tampilInformasi();
    }
 
}
