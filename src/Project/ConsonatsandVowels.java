package Project;

import java.util.Scanner;

public class ConsonatsandVowels {
    public static void main(String[] args) {
    Consonant();
    }
    static void Consonant()
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int consonant=0;
        int vowel=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;

            } else {
                consonant++;
            }
        }
        System.out.println(consonant+" ");
        System.out.println(vowel+" ");

    }
}
