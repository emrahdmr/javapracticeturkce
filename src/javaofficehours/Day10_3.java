package javaofficehours;
import java.util.Scanner;

public class Day10_3 {

	public static void main(String[] args) {
		 // Kullanıcıdan 2 sayı alalım 1. sayı taban olsun. 2. sayı üssü olsun
        // 1. sayının üsünü bulalım

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen taban sayısını giriniz");
        int taban =sc.nextInt();

        System.out.println("Lütfen üss sayısını giriniz");
         int kuvvet = sc.nextInt();

         int sonuc =1;
      /*   while (kuvvet !=0){
​
             sonuc *=taban;
             kuvvet--;
​
         }
        System.out.println("Cevap: " + sonuc);
​
       */

  		/* for (;kuvvet!=0;kuvvet--){
            sonuc *=taban;
        }
        System.out.println("Cevap: " + sonuc);
​
        */

        double result =Math.pow(taban,kuvvet);

System.out.println("Cevap: " + result);

 sc.close();
	}

}
