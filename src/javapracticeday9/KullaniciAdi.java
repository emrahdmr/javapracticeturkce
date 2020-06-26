package javapracticeday9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KullaniciAdi {

	/*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
	 *  1. Adým : Kullanýcýdan ismini isteyelim /// Methi Turan
	 *  2. Adým : Kullanýcý adýndaki boþluklarý silelim. /// MethiTuran
	 *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým. //
	 *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
	 *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		System.out.println("Lütfen Ad Soyad giriniz : ");
		String adSoyad = scan.nextLine().replace(" ", "");
		/*if(veritabanindakiKullaniciListesi.contains(adSoyad)) {
			System.out.println("Bu kullanýcý alýnmýþ.");
		}else {
			System.out.println("Bu kullanýcý adý UYGUN !");
			veritabanindakiKullaniciListesi.add(adSoyad);
		}*/
		System.out.println(veritabanindakiKullaniciListesi.contains(adSoyad) ? "Bu kullanýcý alýnmýþ." : "Bu kullanýcý adý UYGUN !" );
		if(veritabanindakiKullaniciListesi.contains(adSoyad)) {
			int rastgeleSayi = new Random().nextInt(100000);
			String yeniKullaniciAdi = adSoyad + rastgeleSayi;
			System.out.println("YENÝ KULLANICI ADINIZ : " + yeniKullaniciAdi);
		}else {
			System.out.println("YENÝ KULLANICI ADINIZ : " + adSoyad);
		}
		scan.close();
	}
}