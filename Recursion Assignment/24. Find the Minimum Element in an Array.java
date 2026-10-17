import java.util.*;

class Main {
    static int min(int[] a, int i) {
        if (i==a.length - 1)
            return a[i];

        return Math.min(a[i], min(a, i + 1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n =sc.nextInt();
        int[] a=new int[n];

        for (int i = 0; i<n; i++)
            a[i] =sc.nextInt();

        System.out.println(min(a, 0));
    }
}
