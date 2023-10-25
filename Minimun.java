public class Minimun {
    public static void main(String[] args) {
        int[] numara = {75, 35, 23, 31, 34};

        int mini = numara[0];

        for (int i = 1; i < numara.length; i++) {
            if (numara[i] < mini) {
                mini = numara[i];
            }
        }
        System.out.println("Dizideki en küçük eleman: " + mini);
    }

}
