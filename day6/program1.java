class Demo {
    public static void main(String[] args) {
      
        int a = 20,b = 40,c = 15;
	 int large = a;
        int seclarge = b;

        if (b > large) {
            seclarge = large;
            large = b;
        } else {
            if (b > seclarge) {
                seclarge = b;
            }
        }

        if (c > large) {
            seclarge = large;
            large = c;
        } else {
            if (c > seclarge) {
                seclarge = c;
            }
        }

        System.out.println(seclarge);

}}