public class TaskD {
    public static void print(int n,int m) {
        int a=1;
        for (int i = 1; i <=n; i++) {
            for (int j=1; j<=m; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(6,4);
    }
}
