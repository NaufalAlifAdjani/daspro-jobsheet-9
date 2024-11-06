import java.util.Scanner;

public class Tugas3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino","Chocolate Ice"
        };        
        
        String key;
        int hasil = 0;
        boolean ditemukan = false;

        System.out.println("------------Daftar Menu------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " +menu[i]);
        }

        System.out.print("Masukkan Makanan/Minuman yang anda cari : ");
        key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                hasil = i + 1;
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println(key+ " ditemukan pada menu nomor " +hasil);
        } else {
            System.out.println(key+ " tidak ditemukan pada menu");        
        }
        System.out.println();


    }
}