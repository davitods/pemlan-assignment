package prak5_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah)
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * super.getGaji());
    }

    public String toString() {
        super.toString();
        System.out.println("Departemen : " + getDepartemen());
        String dummy = "\n";
        return dummy;
    }
}