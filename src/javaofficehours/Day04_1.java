package javaofficehours;

import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {

		// IndexOf Karakterin yerini belirler. Karakter say�m� 0 dan ba�lar.
				// istanbul kelimesindeki u harfini indexi nedir.
				
//				String str ="Istanbul";
//				System.out.println(str.indexOf('u'));
				
				//last IndexOf methodu arad���m�z karakterin string i�indeki son g�r�n�m�n�n indexini  verir.
				
				String srt1= "sarikayalar";
				System.out.println(srt1.lastIndexOf('a'));
				
				// lenght () String uzunlu�unu verir. Saymaya 1 den ba�lar.
				
				// Kullan�c�dan kelime alal�m  son harflerini yazd�ral�m.
				
//				Scanner sc= new Scanner (System.in);
//				System.out.println("L�tfen bir kelime giriniz.");
//				
//				String str = sc.next();
//				System.out.println(str.charAt(str.length()-1));
				
				//contains() string de aranan karakter var ise True yok ise false d�ner.
				
				String soz ="Java ��renmek bizim i�imiz.";
				System.out.println(soz.contains("biz"));
				System.out.println(soz.contains("son"));
				
				//isEmpty stringde karakter var ise false yok ise true,
				
				String se =" " ;
				System.out.println(se.isEmpty());
				
				// trim() methodu Stringin ba� ve sonundaki bo�luklar� al�yor.
				
				String str3= " ankara ";
				
				System.out.println(str3.trim());
				
				// starsWith () istenen harf ile ba�lay�p ba�lamad���n kontrol eder.
				// true yada false d�ner.
				
				String srt4= "Can Ali";
				System.out.println(srt4.startsWith("A"));
				System.out.println(srt4.startsWith("C"));
				
				// substring methodu stringin belli bir b�l�m�n� kesip almam�za yarar.
				
				String str4 = "istanbullular";
				
				System.out.println(str4.substring(4));
				System.out.println(str4.substring(4, 7)); //[4,7)
				//kullan�c�san tek kelime alal�m ve ilk harfi ile son harfini yerde�i�tirelim.
				
				Scanner sc = new Scanner(System.in);
				 System.out.println("L�tfen tek  kelime giriniz.");
				 String str5=sc.next();
				 
				 char ilk =str5.charAt(0);
				 char son =str5.charAt(str5.length()-1);
				 
				 System.out.println(son+str5.substring(1,str5.length()-1)+ilk);
		
		sc.close();
	}

}
