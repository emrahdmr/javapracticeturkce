package javaofficehours;
import java.util.Scanner;
public class day5_2 {

	   public static void main(String[] args) {
		//	Girilecek kelimenin palindrom olup olmadýðýný doðrulayacak bir Java Kodu yazýn.
		//	kelimeyi tersten yazan  ve ilk hali ve son halini karþýlaþtýran java kodunu yazýnýz.
			//madam ==> madam  12321 ==> 12321
			
			Scanner sc = new Scanner(System.in);
			System.out.println("lütfen Polindron keime giriniz.");
			String str = sc.nextLine();
			
			String tersStr = "";
			int count =str.length()-1;
			
			for (;count>=0;count--) {
				tersStr =tersStr +str.charAt(count);
						
			}
			if(tersStr.equals(str)) {
				System.out.println("true");
			}else {
				System.out.println("false");
		
			}
			sc.close();
		}
	   
	}