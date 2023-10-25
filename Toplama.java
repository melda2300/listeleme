public class Toplama {
    public static void main(String[] args) {
        int[] sayılar = { 76, 21, 3, 21, 24, 23, 22 };
        int toplam = 0;

        for (int i = 0; i < sayılar.length; i++) {
            toplam += sayılar[i];
        }

        System.out.println("Dizidekilerin toplamı: " + toplam);
    }
}
