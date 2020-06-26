package javapracticeday8;

import java.util.Scanner;
public class Question04 {
	/* 1. Kullan�c�n�n girdi�i say�n�n, 
	 * 		for d�ng�s� kullanarak rakamlar� toplam�n� bulan method yaz�n�z.
	 * 
	 * 1. Ad�m : Kullan�c�dan say� al.
	 * 2. Ad�m : Say�y� String'e �evirin.
	 * 3. Ad�m : String'in her eleman�n� say�ya �evir ve toplama ekle
	 * 
	 * Bunu method kullanarak yapal�m methodumuz toplam� return etsin.
	 * Method ismi : public static int getRakamlarToplami(int sayi)
	 * 
	*/
	/* 2. Kullan�c�n�n girdi�i say�n�n, while d�ng�s� kullanarak 
	 * 			 rakamlar� toplam�n� bulan method yaz�n�z.
	 * 
	 * 1. Ad�m : Kullan�c�dan say� al.
	 * 2. Ad�m : Say�n�n %10'unu alarak son hanesini al ve toplama ekle.
	 * 3. Ad�m : Daha sonra say�y� son haneden kurtarmak i�in 10'a b�l.
	 * 4. Ad�m : Say� 0 olarak kadar bu i�lemi while d�ng�s� ile tekrarla.
	 * 
	 * Bunu da method kullanarak yapal�m, toplam� return etsin.
	 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen rakamlar�n� toplamak istedi�iniz say�y� yaz�n�z : ");
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
