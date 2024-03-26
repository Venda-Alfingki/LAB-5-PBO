public class Kucing{
    // Properties
    private String nama;
    private String jenis;
    private String warna;
    private int umur;

    // Constructor
    public Kucing(String nama, String jenis, String warna, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.umur = umur;
    }

    // Methods
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("Umur: " + umur + " tahun");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void bersuara() {
        System.out.println(nama + " sedang bersuara meong-meong.");
    }

    public void lompat() {
        System.out.println(nama + " sedang melompat.");
    }
}
