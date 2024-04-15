public class NilaiMaksimum {
    public static void main(String[] args) {
        int[] array = {10, 45, 78, 23, 56, 98, 12};
        int maks = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maks) {
                maks = array[i];
            }
        }

        System.out.println("Nilai maksimum dalam array: " + maks);
    }
}
