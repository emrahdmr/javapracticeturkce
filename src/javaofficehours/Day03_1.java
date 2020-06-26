package javaofficehours;

import java.util.Scanner;

public class Day03_1 {

	public static void main(String[] args) {
		
		//  Kullacýdan yaþýný ve kilosunu alalýn.
		//18 yaþýndan küçük ise kan baðýyapamasýn.
		//18 yaþýndan büyük ve 50 kilodan zayýf ise kan baðýþý yapamasýn
		// 18 yaþýndan büyük ve 50 kilo da fazla ise kan baðýþý yapabilsin.

		Scanner sc =new Scanner(System.in);
		System.out.println("Lütfrn yaþýnýzý giriniz");
		int yas=sc.nextInt();
		int kilo=sc.nextInt();

		  //yol 1.
//		if(yas>=18) {
//			System.out.println("Lütfen kilonuzu giriniz.");
//			int kilo =sc.nextInt();
//			if(kilo>=50) {
//				System.out.println("Kan verebilirsiniz.");
//				
//			}else {
//				System.out.println("50 kilodan zayýflar kan veremez.");
//			}
//			
//		}else {
//			System.out.println("18 yaþýndan küçükler kan veremez.");
//		}
            //yol2 ternary
		
		String result= (yas>=18 ? kilo>=50 ? "Kan verebilirsiniz." :"50 kilodan zayýflar kan veremez." :"18 yaþýndan küçükler kan veremez.");
		System.out.println(result);



		
		
		sc.close();
		
	}

}
