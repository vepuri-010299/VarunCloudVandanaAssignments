import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(originalArray);

        System.out.print("Shuffled Array: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}