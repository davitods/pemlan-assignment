package prak6;

public class Main {
    public static void main(String[] args) {

        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));

        // Lakukan modifikasi data tambah mahasiswa ...
        Mahasiswa rayPriam = new Mahasiswa("Rayhan Priambodo","Teknik Informatika",false);
        DataMahasiswa.tambahMahasiswa(rayPriam);
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Rasya Dimas", "Teknologi Informasi", false));

        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();

        // Method cariMahasiswa (jika data ada)  
        DataMahasiswa.cariMahasiswa("Denar Abidin");

        // Method cariMahasiswa (jika data tidak ada)
        DataMahasiswa.cariMahasiswa("Denar Jamaludin");

        // Method tampilMahasiswa (sebelum diupdate)
        DataMahasiswa.tampilMahasiswa(rayPriam);

        // Method tampilMahasiswa (setelah diupdate)
        Mahasiswa raySitepu = new Mahasiswa("Rayhan Sitepu", "Magister Ilmu Komputer",true);
        DataMahasiswa.updateMahasiswa(rayPriam, raySitepu);
        DataMahasiswa.tampilMahasiswa(raySitepu);
    }
}