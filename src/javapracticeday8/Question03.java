package javapracticeday8;

public class Question03 {
	/* �� i�e for d�ng�leri kullanarak �arp�m tablosunu 
	 * 			ekrana yazd�r�n�z. 
	 * 1. Ad�m : 1'den 10'a kadar t�m say�lar� g�zden ge�irmek 
	 * 				i�in for d�ng�s� olu�tur.
	 * 2. Ad�m : Her g�zden ge�irilen say� i�in 1'den 10'a kadar 
	 * 				t�m say�larla �arp ve ekrana yazd�r.
	 * 
	 * 1 x 1 = 1
	 * 1 x 2 = 2
	 * 1 x 3 = 3
	 * 
	 * .........
	 * 1 x 10 = 10
	 * 
	 * 2 x 1 = 2
	 * .....
	 * 2 x 10 = 20
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		for(int i = 1 ; i < 11 ; i++) {     
			for(int j = 1 ; j < 11 ; j++) {  
				System.out.println(i +" x "+j + " = " + (i*j));
			}
			System.out.println("\n");
		}
	}
}