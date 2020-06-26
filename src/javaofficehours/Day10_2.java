package javaofficehours;

import javax.swing.*;
import java.util.Scanner;

public class Day10_2 {
    public static void main(String[] args) {

	 // Klavyeden girilecek plaka numarasýndan ili gösteren uygulamayý yazalým
	        /*      "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
	                "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
	                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
	                "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
	                "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
	                "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
	                "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
	                "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
	                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
	                "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	                "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
	                "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
	         */
	       // Scanner sc = new Scanner(System.in);
	       // System.out.println("Lütfen bir plaka numarasý giriniz.");
	       // int plaka = sc.nextInt();

	String Sehirler[] = {"","Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
	                "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
	                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
	                "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
	                "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
	                "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
	                "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
	                "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
	                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
	                "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	                "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
	                "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
	       // System.out.println("Girilen Plaka numarasý " + Sehirler[plaka] + " aittir");
	        int Plaka = Byte.valueOf(JOptionPane.showInputDialog("Lütfen bir plaka numarasý giriniz."));
	       
	        JOptionPane.showMessageDialog(null,Sehirler[Plaka]);

}
}
