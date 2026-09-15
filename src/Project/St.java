package Project;

public class St {
    public static void main(String[] args) {
        String a = "Nagendra";
        String b = "Sunny";
        String c = "100";
        int d = 20;
        System.out.println(a + b);
        System.out.println(Integer.parseInt(c) + d);


        short p = 10;
        byte q = (byte) p;
        System.out.println(q);
        long r = 128l;
        int e = (int) r;
        System.out.println(e);

        float w = 654145411.3251514f;
        long t = (long) w;
        System.out.println(t);

        double y = 25151581.25454541d;
        byte u = (byte) y;
        System.out.println(u);


        int n = 10;
        float v = 20;
        int total = (int) (n * n + 2 * (n * v) + v * v);
        System.out.println(total);


        int age = 20;
        String res = (age >= 20) ? "Eligible for vote" : "Not eligible for vote";
        System.out.println(res);


        int aa = 3;
        aa = aa++;
        System.out.println("Post-Increment a: " + aa);

        aa=++aa;
        System.out.println("Pre-Increment a: "+aa);

        aa=aa--;
        System.out.println("Post-Decrement a: "+aa);

        aa=--aa;
        System.out.println("Pre-Decrement a: "+aa);

    }
}







