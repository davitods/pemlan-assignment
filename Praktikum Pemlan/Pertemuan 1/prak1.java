import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Buah {
    String nama;
    int stok;
    
    public Buah(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void checkoutBuah(int jumlahBeli) {
        if (jumlahBeli <= 0 || stok <= 0) {
            System.out.println("NA");
        } else if (jumlahBeli > stok) {
            System.out.println("Gagal checkout buah");
        } else {
            stok -= jumlahBeli;
            System.out.println("Berhasil checkout buah");
            System.out.println("Sisa buah = " + stok);
        }
    }
}

class Manusia {
    String nama;
    int jumlahBeli;
    
    public Manusia(String nama, int jumlahBeli) {
        this.nama = nama;
        this.jumlahBeli = jumlahBeli;
    }
    
    public int getJumlahbeli() {
        return jumlahBeli;
    }
}

public class prak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama = input.nextLine();
        int stok = input.nextInt();
        int jumlahBeli = input.nextInt();
        
        Buah buah = new Buah(nama, stok);
        Manusia manusia = new Manusia("Pak Tejo", jumlahBeli);
        
        buah.checkoutBuah(manusia.getJumlahbeli());
    }
}