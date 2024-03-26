public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Momo", "Anggora", "Putih", 3);
        kucing1.info();
        kucing1.tidur();
        kucing1.makan();
        kucing1.bersuara();
        kucing1.lompat();
        System.out.println();

        Kucing kucing2 = new Kucing("Kitty", "Persia", "Coklat", 5);
        kucing2.info();
        kucing2.tidur();
        kucing2.makan();
        kucing2.bersuara();
        kucing2.lompat();
        System.out.println();

        Kucing kucing3 = new Kucing("Luna", "Maine Coon", "Abu-abu", 2);
        kucing3.info();
        kucing3.tidur();
        kucing3.makan();
        kucing3.bersuara();
        kucing3.lompat();
    }
}
