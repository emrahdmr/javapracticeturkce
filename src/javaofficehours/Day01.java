package javaofficehours;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		
		// Kullanýcadan 5 basamaklý tam sayý alalým ve bu sayýnýn baþtan 2 ve sonda 2 rakamlarýn
				// basamak deðeri ile toplama sonucunu yazdýralým.  12345 => 12045
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Lütfen 5 basamaklý tam sayý giriniz.");
				
				int num = sc.nextInt();
				
				int ilkIki=num/1000;
				System.out.println(ilkIki);
				ilkIki=ilkIki*1000;
				
				
				int sonIki= num%100;
				System.out.println(sonIki);
				
				int sum = ilkIki + sonIki;
				
				System.out.println("Toplam:" +sum);
				
				sc.close();
	}

}
