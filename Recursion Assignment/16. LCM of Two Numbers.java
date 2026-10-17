import java.util.*;

class Main {
    static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a % b);
    }
    static int lcm(int a, int b) {
        return Math.abs(a / gcd(a, b)*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a==0 || b==0)
            System.out.println(0);
        else
            System.out.println(lcm(a,b));
    }
}
