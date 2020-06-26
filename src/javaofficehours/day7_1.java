package javaofficehours;
import java.util.Scanner;

public class day7_1 {

	public static void main(String[] args) {
		//Kullanýcýdan iki sayý girmesini ve ardýndan iþlem seçmesi istenecek.
		//Tüm iþlemler methodlarda yapýlacak.  
		//toplama , çýkartma, çarpma  ve bölme
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ilk sayiyi giriniz");
		double num1 = scan.nextDouble();
		System.out.println("Lütfen ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();
		
		System.out.println("toplama, cikarma, bölme ya da carpa islemlerinden birini giriniz.");
		String islem = scan.next().toLowerCase();
		islem(islem,num1,num2);
		
		scan.close();
	}
public static void islem(String islem, double num1, double num2) {
		
		switch (islem) {
		case "toplama":
			toplama(num1,num2);
			break;
		case "cikarma":
			cikarma(num1,num2);
			break;
		case "bölme":
			bölme(num1,num2);
			break;
		case "carpma":
			carpma(num1,num2);
			break;
		default:
			System.out.println("Yanlis islem yaptiniz!");
			
		}
		
}
	
	public static void toplama (double num1, double num2) {
		System.out.println(num1+num2);
	}
	public static void cikarma (double num1, double num2) {
		System.out.println(num1-num2);
	}
	public static void bölme (double num1, double num2) {
		System.out.println(num1/num2);
	}
	public static void carpma (double num1, double num2) {
		System.out.println(num1*num2);
	}
	
	
}