public class OddEvenNumber {
    public static void main(String[] args) {
        int[] arr = {2, 9, 1, 3, 8, 4};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Evem numbers : " + arr[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd numbers : " + arr[i] + " ");
            }
        }
    }
}
