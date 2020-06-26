package javapracticeday8;

import java.util.Random;
import java.util.Scanner;
public class Question02 {
	public static void main(String[] args) {
		/*
		 * Whilde döngüsü kullanarak "sayý tahmin oyunu" yazýnýz. 
		 * 
		 * 1. Adým : Java ile rastgele bir sayý üretelim 
		 * 			 (new Random().nextInt(50) kullanabilrsiniz)
		 * 2. Adým : Kullanýcýdan tahminini alalým.
		 * 3. Adým : Kullanýcýnýn girdiði tahmini, bilgisayarýn ürettiði 
		 * 			 rastgele sayý ile karþýlaþtýralým.
		 * 4. Adým : Cevap doðru olana kadar 2. ve 3. adýmý tekrarlayalým, 
		 * 			 bunu da while döngüsü ile yapalým.
		 *
		 * */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int rastgeleSayi = random.nextInt(10); // 0 - 10 .
		int tahmin = -1;
		//System.out.println(rastgeleSayi);
		while(tahmin != rastgeleSayi) {
			System.out.println("Lütfen tahmininizi yazýnýz : ");
			tahmin = scan.nextInt();
			if(tahmin == rastgeleSayi)
				System.out.println("Tebrikler ! Kazandýnýz.");
			else
				System.out.println("Yanlýþ cevap ! Tekrar deneyiniz.");
		}
		scan.close();
	}
}