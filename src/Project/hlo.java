package Project;

import java.util.Arrays;

public class hlo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int []num)
    {
        num[0]=5;
        num[3]=2;

    }
}
