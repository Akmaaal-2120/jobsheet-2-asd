public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 matkul1 = new MataKuliah15();
        matkul1.kodeMK = "SIB242009";
        matkul1.nama = "Sistem Operasi";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(7);
        matkul1.tampilInformasi();
        System.out.println("---------------------------");

        MataKuliah15 matkul2 = new MataKuliah15("SIB242001", "Kewarganegaraan", 2, 2);
        matkul2.tampilInformasi();
        matkul2.ubahSKS(4);
        matkul2.tambahJam(2);
        matkul2.kurangiJam(3);
        matkul2.tampilInformasi();
    }
}
