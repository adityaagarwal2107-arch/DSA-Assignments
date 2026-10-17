class Main {
    static int count(int n) {
        if (n==0)
            return 0;

        return 1 + count(n/10);
    }

    public static void main(String[] args) {
        int n = 98765;

        if (n==0)
            System.out.println(1);
        else
            System.out.println(count(Math.abs(n)));
    }
}
