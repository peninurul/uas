package uas2;

class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class MahasiswaBaru extends Mahasiswa {
    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }
    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

class MahasiswaLama extends Mahasiswa {
    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }
    public int getAngkatan() {
        return angkatan;
    }
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Peni Nurul Fauzah", 20);
        mahasiswa.displayInfo();
        System.out.println("");

        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Peni Nurul Fauzah", 20, 22166023);
        mahasiswaBaru.displayInfo();
        System.out.println("");

        MahasiswaLama mahasiswaLama = new MahasiswaLama("Peni Nurul Fauzah", 20, 2022);
        mahasiswaLama.displayInfo();
    }
}
