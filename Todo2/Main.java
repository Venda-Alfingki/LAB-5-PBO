import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek ArrayList
        ArrayList<String> daftarNama = new ArrayList<>();

        // Menambahkan elemen ke dalam ArrayList
        daftarNama.add("vinka");
        daftarNama.add("najwa");
        daftarNama.add("venda");

        // Mengakses elemen pada indeks tertentu
        String namaKedua = daftarNama.get(1);
        System.out.println("Nama pada indeks ke-1: " + namaKedua);

        // Menghapus elemen dari ArrayList
        daftarNama.remove("najwa");
        System.out.println("Setelah penghapusan: " + daftarNama);
    }
}
