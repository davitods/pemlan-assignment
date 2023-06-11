package prak6;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private boolean status; 

    public Mahasiswa(String nama, String jurusan, boolean status) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.status = status;
    }

    public Mahasiswa() {}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean geStatus() {
        return this.status;
    }
}
