package javapracticeday9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KullaniciAdi {

	/*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
	 *  1. Ad�m : Kullan�c�dan ismini isteyelim /// Methi Turan
	 *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim. /// MethiTuran
	 *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m. //
	 *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
	 *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		System.out.println("L�tfen Ad Soyad giriniz : ");
		String adSoyad = scan.nextLine().replace(" ", "");
		/*if(veritabanindakiKullaniciListesi.contains(adSoyad)) {
			System.out.println("Bu kullan�c� al�nm��.");
		}else {
			System.out.println("Bu kullan�c� ad� UYGUN !");
			veritabanindakiKullaniciListesi.add(adSoyad);
		}*/
		System.out.println(veritabanindakiKullaniciListesi.contains(adSoyad) ? "Bu kullan�c� al�nm��." : "Bu kullan�c� ad� UYGUN !" );
		if(veritabanindakiKullaniciListesi.contains(adSoyad)) {
			int rastgeleSayi = new Random().nextInt(100000);
			String yeniKullaniciAdi = adSoyad + rastgeleSayi;
			System.out.println("YEN� KULLANICI ADINIZ : " + yeniKullaniciAdi);
		}else {
			System.out.println("YEN� KULLANICI ADINIZ : " + adSoyad);
		}
		scan.close();
	}
}