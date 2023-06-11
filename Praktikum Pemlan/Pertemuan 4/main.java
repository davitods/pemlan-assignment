package prak4;

public class main {
public static void main(String[] args) {
        swalayan t1 = new swalayan("Faiz Rizki", "Gold");
        System.out.println(" PELANGGAN 001");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Nama: " + t1.getNama());
        System.out.println("Jenis Rekening: " + t1.getjenisRekening());
        t1.setnomorPelanggan("5683916371");
        t1.setPin("7304");
        System.out.println("--------------------------------------------------------------------");
        
        t1.autentifikasi("5683916371", "7304");
        t1.topUp(100000);
        t1.setPembelian(80000);
        System.out.println("\n");

        swalayan t2 = new swalayan("Affan Haq", "Platinum");
        System.out.println(" PELANGGAN 002");
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println("Nama: " + t2.getNama());
        System.out.println("Jenis Rekening: " + t2.getjenisRekening());
        t2.setnomorPelanggan("7492739632");
        t2.setPin("7731");
        System.out.println("--------------------------------------------------------------------");
        
        t2.autentifikasi("7492739632", "7131");
        t2.autentifikasi("7492739632", "7731");
        t2.topUp(500000);
        t2.setPembelian(480000);
        System.out.println("\n");

        swalayan t3 = new swalayan("Reza Aulia", "Silver");
        System.out.println(" PELANGGAN 003");
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println("Nama: " + t3.getNama());
        System.out.println("Jenis Rekening: " + t3.getjenisRekening());
        t3.setnomorPelanggan("3886329173");
        t3.setPin("8732");
        System.out.println("--------------------------------------------------------------------");
        
        t3.autentifikasi("3886329173", "8730");
        t3.autentifikasi("3886329173", "8742");
        t3.autentifikasi("3886329173", "8832");
        t3.setPembelian(50000);
    }    
}

