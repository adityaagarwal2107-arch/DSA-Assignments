import java.util.*;

class Main {
    static int decimal(String s, int n) {
        if (n==0)
            return 0;

        return (s.charAt(n - 1) -'0') *(int) Math.pow(2, s.length()-n)
               + decimal(s,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.next();

        System.out.println(decimal(s, s.length()));
    }
}
