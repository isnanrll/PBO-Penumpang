package pboPenumpang;

import java.util.Scanner;

abstract class Penumpang {
    protected String nama;
    protected String noTiket;

    public Penumpang(String nama, String noTiket) {
        this.nama = nama;
        this.noTiket = noTiket;
    }

    // ABSTRACT METHOD
    public abstract double hitungHargaTiket();

    // OVERLOADING METHOD (versi 1)
    public void tampilkanData() {
        System.out.println("Nama        : " + nama);
        System.out.println("No Tiket    : " + noTiket);
        System.out.println("Harga Tiket : Rp " + hitungHargaTiket());
    }

    // OVERLOADING METHOD (versi 2)
    public void tampilkanData(String jenis) {
        tampilkanData();
        System.out.println("Jenis       : " + jenis);
    }
}

class PenumpangReguler extends Penumpang {

    public PenumpangReguler(String nama, String noTiket) {
        super(nama, noTiket);
    }

    // OVERRIDING
    @Override
    public double hitungHargaTiket() {
        return 100000; // harga reguler
    }
}

class PenumpangVIP extends Penumpang {

    public PenumpangVIP(String nama, String noTiket) {
        super(nama, noTiket);
    }

    // OVERRIDING
    @Override
    public double hitungHargaTiket() {
        return 150000; // harga VIP
    }
}

class InputPenumpang {
    protected Scanner input = new Scanner(System.in);

    public String inputNama() {
        System.out.print("Nama Penumpang : ");
        return input.nextLine();
    }

    public String inputNoTiket() {
        System.out.print("No Tiket       : ");
        return input.nextLine();
    }

    public int inputJenis() {
        System.out.print("Jenis (1 = Reguler, 2 = VIP): ");
        return input.nextInt();
    }
}