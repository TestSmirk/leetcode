public class qejqwkle {
    public static void main(String[] args) {
        System.out.println(1 + 2 + "3");
        int a = 0, b = 0, c;
        if (a > b) c = 0;

        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;

        }
        System.out.println(t);
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;

            }
        }
        System.out.println(sum);
        System.out.println(Integer.toBinaryString(200));
        int N =200;
        String s="";
        for (int n =N;n>0;n/=2)
        {
            s = (n%2)+s;
        }
        System.out.println(s);

        int[] a1 = new int[10];
        for (int i = 0; i < 10; i++) {

        }
    }
}
