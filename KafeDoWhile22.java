import java.util.Scanner;

public class KafeDoWhile22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (atau ketik 'batal' untuk berhenti): ");
            String namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                break;
            }

            System.out.print("Jumlah kopi yang dibeli: ");
            int kopi = sc.nextInt();

            System.out.print("Jumlah teh yang dibeli: ");
            int teh = sc.nextInt();

            System.out.print("Jumlah roti yang dibeli: ");
            int roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
