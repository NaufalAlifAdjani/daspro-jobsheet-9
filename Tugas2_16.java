import java.util.Scanner;

public class Tugas2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.print("Masukkan Jumlah Pesanan : ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];

        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" +(i+1)+ " : ");
            pesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga " +pesanan[i]+ " : Rp.");
            harga[i] = sc.nextInt();
            sc.nextLine();

            total += harga[i];
        }

        System.out.println();
        System.out.println("----------Daftar Pesanan-----------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i+1) + ". " +pesanan[i]+ " = Rp. " +harga[i]);
        }
        System.out.println("Total biaya yang harus dibayar : Rp. " +total);
    }
}