package javaofficehours;

import java.util.Scanner;

public class Day10_4 {
	public static void main(String[] args) {

		// Kullan�c� 0 say�s� girene kadar girilen
		        // say�lar� toplayan java kosu yazal�m

		Scanner sc = new Scanner(System.in);
		        System.out.println("L�tfen bir say� giriniz");

		        
		
		int toplam=0;
		        int num =sc.nextInt();

		        do {

		        	System.out.println("Tekrar say� giriniz: ");
		            num = sc.nextInt();
		            toplam+= num;

		            //   System.out.println("Girilen Say�lat�n toplam�: " + toplam);

		        }while ( num !=0);

		        System.out.println("Genel Toplam: " + toplam);
		        
		        sc.close();
	}
}
	

