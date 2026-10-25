public class TaskF{
    public static boolean isPrime(int n, int m) {
        int a = 0;
        int c=0;
        for (int i = n; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if (n % i == 0) {
                    a++;
                }
            }
            if (a == 2) {
                c++;
            }
        }
    System.out.println("Prime count= "+c);
        return c>0;
    }
    public static void main(String[] args) {
        isPrime(10, 30);
    }
}