import java.util.*;

class Main {
    static String replace(String s, char old, char ne, int i) {
        if (i==s.length())
            return "";

        if (s.charAt(i) == old)
            return ne + replace(s, old, ne, i + 1);

        return s.charAt(i) + replace(s, old, ne, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();
        char old=sc.next().charAt(0);
        char ne=sc.next().charAt(0);

        System.out.println(replace(s, old, ne, 0));
    }
}
