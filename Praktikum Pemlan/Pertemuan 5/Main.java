package prak5_2;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Hafizh","0101",true,true);
        System.out.println(manusia1);

        Manusia manusia2 = new Manusia("Rakha","2020",false,true);
        System.out.println(manusia2);

        Manusia manusia3 = new Manusia("Atma","3003",false,false);
        System.out.println(manusia3);

        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("225150400111009",2.5,"Iza","4400",false,false);
        System.out.println(mahasiswa1);

        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("225150401111023",3.3,"Iman","0055",false,false);  
        System.out.println(mahasiswa2);

        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("225150407111002", 3.7,"Taka","0606",false,false);
        System.out.println(mahasiswa3);
       
        Pekerja pekerja1 = new Pekerja (1000, 2021, 10, 3, 2, "Rafli", "7777", true, true);
        System.out.println(pekerja1);

        Pekerja pekerja2 = new Pekerja (1000, 2014, 8, 1, 0, "Anan", "8808", true, true);
        System.out.println(pekerja2);

        Pekerja pekerja3 = new Pekerja (1000, 2003, 3, 8, 10, "Nanta", "9099", false, true);
        System.out.println(pekerja3);

        Manager manager1 = new Manager("HRD", 7500, 2008, 12, 24, 3, "Rizki", "1111", true, true);
        System.out.println(manager1);
        }
    }