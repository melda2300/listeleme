public class Max {
    public static void main(String[] args) {
        int[] numara = {75, 35, 55, 45,60 ,65};

        int max = numara[0];

        for (int i = 0; i <numara.length; i++) {
            if (numara[i] > max) {
                max = numara[i];
            }
        }
        System.out.println("Dizideki en büyük eleman: " + max);
    }
}
