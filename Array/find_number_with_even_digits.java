public class find_number_with_even_digits {
    // Find numbers with even numbers of digits
    // nums = [12,345,2,6,7896], numbers with even numbers of digit = 2
    public static void main(String[] args) {
        System.out.println(number(new int[] { 12, 345, 2, 6, 7896 }));
    }

    public static int number(int[] arr) {
        int countNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            int countDigit = 0;
            while (arr[i] != 0) {
                countDigit += 1;
                arr[i] /= 10;
            }
            if (countDigit % 2 == 0) {
                countNumber++;
            }
        }
        return countNumber;
    }

}
