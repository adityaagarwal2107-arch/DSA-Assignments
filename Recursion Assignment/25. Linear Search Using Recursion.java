import java.util.*;

class Main {
    static int search(int[] a, int key, int i) {
        if (i==a.length)
            return -1;

        if (a[i] ==key)
            return i;

        return search(a, key, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] a =new int[n];

        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();

        int key=sc.nextInt();

        int result = search(a, key, 0);

        if (result== -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at index " + result);
    }
}
