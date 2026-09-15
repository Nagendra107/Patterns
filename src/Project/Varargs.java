package Project;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        man(2,3,4,5,65,7,3,1);

    }
    static void man(int ...n)
    {
        System.out.println(Arrays.toString(n));
    }
}
