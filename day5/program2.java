class Demo {
    public static void main(String[] args) {
        int a = 20, b = 50, c = 40;
        if(a <= b && a <= c) {
            System.out.print(a);
        } else if(b <= a && b <= c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}
