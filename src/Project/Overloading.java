package Project;

public class Overloading {
    public static void main(String[] args) {

           // fun(89);
        fun("nagendra");

        }
        static void fun(int a)
        {
            System.out.println(a);
        }
        static void  fun(String name)
        {
            System.out.println("My name is:"+name);
        }

}
