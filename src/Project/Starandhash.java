package Project;

import java.util.Scanner;

public class Starandhash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int count1=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == '#') {
                count++;
            } else if (ch == '*') {
                count1++;
            }
        }
        int res=count-count1;
        System.out.println(res);

            }

        }
