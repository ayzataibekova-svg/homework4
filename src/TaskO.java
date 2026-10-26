public class TaskO {
    public static boolean isPalindrome(int n) {
        int a=0;
        for (int i=n; i>0; i=i/10) {
            int b=i%10;
            a=a*10+b;
        }
        return a==n;
    }
    public static void main(String[] args) {
        if (isPalindrome(121)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}