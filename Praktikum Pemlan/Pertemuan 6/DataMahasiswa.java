package prak6;

import java.util.ArrayList;

public class DataMahasiswa {
    private static ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();

    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mahasiswa) {
        listMahasiswa.add(mahasiswa);
        return listMahasiswa;
    }

    public static void tampilSemuaData() {
        int i = 1;
        for (Mahasiswa mahasiswa : listMahasiswa) {
            System.out.println("=== Tampilan Data Mahasiswa " + i + " Filkom UB ===");
            tampilMahasiswa(mahasiswa);
            System.out.println();
            i++;
        }
    }

    public static void cariMahasiswa(String string) {

    }

    public static Mahasiswa cariMahasiswa(Mahasiswa namaMahasiswa) {
        for (Mahasiswa mahasiswa : listMahasiswa) {
            if (mahasiswa.getNama().equals(namaMahasiswa.getNama())) {
                System.out.println("Data mahasiswa atas nama " + namaMahasiswa.getNama() + " ditemukan");
                return mahasiswa;
            }
        }
        System.out.println("Data mahasiswa atas nama " + namaMahasiswa.getNama() + " tidak ditemukan");
        return null;
    }

    public static void tampilMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("Nama Mahasiswa\t: " + mahasiswa.getNama());
        System.out.println("Jurusan\t\t: " + mahasiswa.getJurusan());
        if (mahasiswa.geStatus() == true){
            System.out.println("Status\t\t: Menikah");
        } else {
            System.out.println("Status\t\t: Lajang");
        }
    }

    public static void updateMahasiswa(Mahasiswa mahasiswaLama, Mahasiswa mahasiswaBaru) {
        int i = 0;
        for (Mahasiswa mahasiswa : listMahasiswa) {
            if (mahasiswa.getNama().equals(mahasiswaLama.getNama())) {
                listMahasiswa.set(i, mahasiswaBaru);
                System.out.println("Data mahasiswa atas nama " + mahasiswaLama.getNama() + " berhasil diupdate\n");
                return;
            }
            i++;
        }
        System.out.println("Data mahasiswa atas nama " + mahasiswaLama.getNama() + " tidak ditemukan");
    }
}
