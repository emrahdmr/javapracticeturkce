package javapracticeday8;

public class Question03 {
	/* Ýç içe for döngüleri kullanarak çarpým tablosunu 
	 * 			ekrana yazdýrýnýz. 
	 * 1. Adým : 1'den 10'a kadar tüm sayýlarý gözden geçirmek 
	 * 				için for döngüsü oluþtur.
	 * 2. Adým : Her gözden geçirilen sayý için 1'den 10'a kadar 
	 * 				tüm sayýlarla çarp ve ekrana yazdýr.
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