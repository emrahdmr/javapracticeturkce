package javaofficehours;

import java.util.Scanner;

public class Day10_4 {
	public static void main(String[] args) {

		// Kullanýcý 0 sayýsý girene kadar girilen
		        // sayýlarý toplayan java kosu yazalým

		Scanner sc = new Scanner(System.in);
		        System.out.println("Lütfen bir sayý giriniz");

		        
		
		int toplam=0;
		        int num =sc.nextInt();

		        do {

		        	System.out.println("Tekrar sayý giriniz: ");
		            num = sc.nextInt();
		            toplam+= num;

		            //   System.out.println("Girilen Sayýlatýn toplamý: " + toplam);

		        }while ( num !=0);

		        System.out.println("Genel Toplam: " + toplam);
		        
		        sc.close();
	}
}
	

