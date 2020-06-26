package javaofficehours;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day9_1 {

	 public static void main(String[] args) {

		 // Kullanicdan 2 binnary sayi alalim ve
		         // 2 binnary sayiyi toplayan kodu yazalim
		         //100
		         //101
		         //+....

		         Scanner sc = new Scanner(System.in);
		         System.out.println("Lütfen 2 tane binary sayı giriniz.");
		         long binary1 = sc.nextLong();
		         long binary2 = sc.nextLong();
		         int elde = 0;
		         List<Integer> sum = new ArrayList<>();

		         while (binary1 != 0 || binary2 != 0) {
		             sum.add((int) ((binary1 % 10 + binary2 % 10 + elde) % 2));
		             elde = (int) ((binary1 % 10 + binary2 % 10 + elde) / 2);
		             binary1 = binary1 / 10;
		             binary2 = binary2 / 10;

		         }
		         sc.close();

		 if (elde != 0) {
		             sum.add(elde);
		         }
		         System.out.println(elde);
		         for (int i = sum.size() - 1; i >= 0; i--) {
		             System.out.print(sum.get(i));
		         }
		     }
		 }