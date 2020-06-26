package javapracticeday8;

import java.util.Scanner;
public class Question04 {
	/* 1. Kullanýcýnýn girdiði sayýnýn, 
	 * 		for döngüsü kullanarak rakamlarý toplamýný bulan method yazýnýz.
	 * 
	 * 1. Adým : Kullanýcýdan sayý al.
	 * 2. Adým : Sayýyý String'e çevirin.
	 * 3. Adým : String'in her elemanýný sayýya çevir ve toplama ekle
	 * 
	 * Bunu method kullanarak yapalým methodumuz toplamý return etsin.
	 * Method ismi : public static int getRakamlarToplami(int sayi)
	 * 
	*/
	/* 2. Kullanýcýnýn girdiði sayýnýn, while döngüsü kullanarak 
	 * 			 rakamlarý toplamýný bulan method yazýnýz.
	 * 
	 * 1. Adým : Kullanýcýdan sayý al.
	 * 2. Adým : Sayýnýn %10'unu alarak son hanesini al ve toplama ekle.
	 * 3. Adým : Daha sonra sayýyý son haneden kurtarmak için 10'a böl.
	 * 4. Adým : Sayý 0 olarak kadar bu iþlemi while döngüsü ile tekrarla.
	 * 
	 * Bunu da method kullanarak yapalým, toplamý return etsin.
	 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen rakamlarýný toplamak istediðiniz sayýyý yazýnýz : ");
		int sayi = scan.nextInt();
		System.out.println(getRakamlarToplami(sayi)); 
		System.out.println(getRakamlarToplamiWhileDongusu(sayi)); 
	
		scan.close();
	}
	public static int getRakamlarToplami(int sayi) {
		String sayininStringi = String.valueOf(sayi); /// "345"
		int toplam = 0;
		for(int i =  0 ; i < sayininStringi.length(); i++ ) {
			int sayiyaCevir = Integer.parseInt(sayininStringi.substring(i, i+1));
			toplam += sayiyaCevir; // 3 + 4 + 5
		}
		return toplam;
		
	}
	public static int getRakamlarToplamiWhileDongusu(int sayi) { /// 123
		int toplam = 0;
		while( sayi > 0 ) {
			int sonHane = sayi % 10 ; // 3  	 2     1
			toplam += sonHane;		  // 3+2	 5+1   6			
			sayi = sayi / 10;		  // 12		 1     0
		}
		return toplam;
		
		
	}
}
