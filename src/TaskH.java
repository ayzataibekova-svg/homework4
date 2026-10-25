public class TaskH {
    public static int decimalToBinary(int n) {
        int a = 0;
        int b = 1;

        while (n > 0) {
            int c = n % 2;
            a = a + c * b;
            b = b * 10;
            n = n / 2;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Binary = " + decimalToBinary(13));
    }
}