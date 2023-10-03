import java.util.Scanner;

public class Bank26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int stok_makanan_ringan_awal, stok_minuman_kaleng_awal, stok_makanan_ringan_yang_kadaluarsa, stok_minuman_kaleng_yang_kadaluarsa, stok_makanan_ringan_layak_konsumsi, stok_minuman_kaleng_layak_konsumsi;

        System.out.println("Masukkan stok makanan ringan awal anda: ");
        stok_makanan_ringan_awal = input.nextInt();
        System.out.println("Masukkan stok minuman kaleng awal anda: ");
        lama_menabung = input.nextInt();

        bunga = (double) (lama_menabung * prosentase_bunga * jml_tabungan_awal);
        jml_tabungan_akhir =  (double) (bunga + jml_tabungan_awal);

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
    }
}