package prak7;

public class Main {
    public static void main(String[] args) { //("tahu goreng", 10.0, 0.5); ("Nagasari", 18.0, 1.5);
        Kue[] arrayKue = new Kue[20];

        arrayKue[0] = new KuePesanan("Donat", 5.0, 0.4);
        arrayKue[1] = new KuePesanan("Risol", 2.0, 0.2);
        arrayKue[2] = new KuePesanan("Lupis", 2.0, 0.2);
        arrayKue[3] = new KuePesanan("Tart", 30.0, 0.8);
        arrayKue[4] = new KuePesanan("Pancake", 15.0, 0.5);
        arrayKue[5] = new KuePesanan("Klepon", 1.0, 0.1);
        arrayKue[6] = new KuePesanan("Lemper", 3.0, 0.1);
        arrayKue[7] = new KuePesanan("Nagasari", 2.0, 0.1);
        arrayKue[8] = new KuePesanan("Cucur", 2.0, 0.2);
        arrayKue[9] = new KuePesanan("Serabi", 3.0, 0.3);
        arrayKue[10] = new KueJadi("Cenil", 1.0, 5);
        arrayKue[11] = new KueJadi("Onde-onde", 2.0, 5);
        arrayKue[12] = new KueJadi("Talam", 5.0, 5);
        arrayKue[13] = new KueJadi("Bolu", 20.0, 2);
        arrayKue[14] = new KueJadi("Pastel", 5.0, 10);
        arrayKue[15] = new KueJadi("Muffin", 5.0, 5);
        arrayKue[16] = new KueJadi("Kue Sus", 3.0, 10);
        arrayKue[17] = new KueJadi("Kroket", 3.0, 5);
        arrayKue[18] = new KueJadi("Putu", 1.0, 10);
        arrayKue[19] = new KueJadi("Kastengel", 1.0, 20);

        for (Kue kue : arrayKue) {
            if (kue instanceof KuePesanan) {
                System.out.println("Jenis: Kue Pesanan");
            } else if (kue instanceof KueJadi) {
                System.out.println("Jenis: Kue Jadi");
            }
            System.out.println(kue);
        }

        double totalHarga = 0;
        for (Kue kue : arrayKue) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("Total Harga: " + totalHarga);

        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).berat;
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat);

        double totalHargaJadi = 0;
        double totalJumlah = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).jumlah;
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah);

        double hargaTerbesar = 0;
        Kue kueTerbesar = null;
        for (Kue kue : arrayKue) {
            if (kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Kue dengan Harga Terbesar: " + kueTerbesar);
    }
}
