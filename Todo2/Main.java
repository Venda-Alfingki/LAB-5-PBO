import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta pengguna untuk memasukkan usia
        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        // Menampilkan informasi yang dimasukkan oleh pengguna
        System.out.println("Halo, " + nama + "! Usia Anda adalah " + usia + " tahun.");

        // Menutup objek Scanner
        scanner.close();
    }
}
