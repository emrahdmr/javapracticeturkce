package javaofficehours;

import javax.swing.*;
import java.util.Scanner;

public class Day10_2 {
    public static void main(String[] args) {

	 // Klavyeden girilecek plaka numaras�ndan ili g�steren uygulamay� yazal�m
	        /*      "Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara",
	                "Antalya", "Artvin", "Ayd�n", "Bal�kesir", "Bilecik", "Bing�l", "Bitlis",
	                "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum", "Denizli",
	                "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir",
	                "Gaziantep", "Giresun", "G�m��hane", "Hakkari", "Hatay", "Isparta",
	                "��el (Mersin)", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
	                "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa",
	                "K.mara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize",
	                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon",
	                "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	                "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan",
	                "I�d�r", "Yalova", "Karab�k", "Kilis", "Osmaniye", "D�zce"
	         */
	       // Scanner sc = new Scanner(System.in);
	       // System.out.println("L�tfen bir plaka numaras� giriniz.");
	       // int plaka = sc.nextInt();

	String Sehirler[] = {"","Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara",
	                "Antalya", "Artvin", "Ayd�n", "Bal�kesir", "Bilecik", "Bing�l", "Bitlis",
	                "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum", "Denizli",
	                "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir",
	                "Gaziantep", "Giresun", "G�m��hane", "Hakkari", "Hatay", "Isparta",
	                "��el (Mersin)", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
	                "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa",
	                "K.mara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize",
	                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon",
	                "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	                "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan",
	                "I�d�r", "Yalova", "Karab�k", "Kilis", "Osmaniye", "D�zce"};
	       // System.out.println("Girilen Plaka numaras� " + Sehirler[plaka] + " aittir");
	        int Plaka = Byte.valueOf(JOptionPane.showInputDialog("L�tfen bir plaka numaras� giriniz."));
	       
	        JOptionPane.showMessageDialog(null,Sehirler[Plaka]);

}
}
