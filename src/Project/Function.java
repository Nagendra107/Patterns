package Project;

public class Function {
    public static void main(String[]args)
    {
      int res= sum(10,20);
      int m=sum1(20,90);
       System.out.println(res+ ""+m);
    }
    static int sum(int a,int b)
    {
        int rs=a+b;
        return rs;
    }
    static int sum1(int a, int b){
        int s=a+b;
        return s;
    }
}
