package javaofficehours;
import java.util.Scanner;

public class day7_1 {

	public static void main(String[] args) {
		//Kullan�c�dan iki say� girmesini ve ard�ndan i�lem se�mesi istenecek.
		//T�m i�lemler methodlarda yap�lacak.  
		//toplama , ��kartma, �arpma  ve b�lme
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ilk sayiyi giriniz");
		double num1 = scan.nextDouble();
		System.out.println("L�tfen ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();
		
		System.out.println("toplama, cikarma, b�lme ya da carpa islemlerinden birini giriniz.");
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
		case "b�lme":
			b�lme(num1,num2);
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
	public static void b�lme (double num1, double num2) {
		System.out.println(num1/num2);
	}
	public static void carpma (double num1, double num2) {
		System.out.println(num1*num2);
	}
	
	
}