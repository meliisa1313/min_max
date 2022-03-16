package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz :");
        int i,min=0,max=0;
        int s=input.nextInt();

        for(i=1;i<=s;i++)
        {
            System.out.println("Sayi:");
            int a=input.nextInt();
            if(i==1)
            {
                min=a;
                max=a;
            }

            if(a<min)
            {
                min=a;
            }
            if(max<a)
            {
                max=a;
            }
        }
        System.out.println("En küçüğü:"+min);
        System.out.println("En büyüğü:"+max);










    }
}



















