package pboPenumpang;
/**
 * @author nana
 */
public class Main {
    public static void main(String[] args) {

        InputPenumpang ip = new InputPenumpang();

        String nama = ip.inputNama();
        String noTiket = ip.inputNoTiket();
        int jenis = ip.inputJenis();

        Penumpang p;

        if (jenis == 1) {
            p = new PenumpangReguler(nama, noTiket);
            p.tampilkanData("Reguler");
        } else {
            p = new PenumpangVIP(nama, noTiket);
            p.tampilkanData("VIP");
        }
    }
}