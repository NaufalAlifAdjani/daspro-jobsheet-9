import java.util.Scanner;

public class Tugas1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = sc.nextInt();

        int[] nilaiMhs = new int[jumlahNilai];
        int total = 0;
        int tertinggi = Integer.MIN_VALUE;
        int terendah = Integer.MAX_VALUE;

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        double rataRata = (double) total / jumlahNilai;

        System.out.println();
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println();

        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }
}