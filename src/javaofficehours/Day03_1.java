package javaofficehours;

import java.util.Scanner;

public class Day03_1 {

	public static void main(String[] args) {
		
		//  Kullac�dan ya��n� ve kilosunu alal�n.
		//18 ya��ndan k���k ise kan ba��yapamas�n.
		//18 ya��ndan b�y�k ve 50 kilodan zay�f ise kan ba���� yapamas�n
		// 18 ya��ndan b�y�k ve 50 kilo da fazla ise kan ba���� yapabilsin.

		Scanner sc =new Scanner(System.in);
		System.out.println("L�tfrn ya��n�z� giriniz");
		int yas=sc.nextInt();
		int kilo=sc.nextInt();

		  //yol 1.
//		if(yas>=18) {
//			System.out.println("L�tfen kilonuzu giriniz.");
//			int kilo =sc.nextInt();
//			if(kilo>=50) {
//				System.out.println("Kan verebilirsiniz.");
//				
//			}else {
//				System.out.println("50 kilodan zay�flar kan veremez.");
//			}
//			
//		}else {
//			System.out.println("18 ya��ndan k���kler kan veremez.");
//		}
            //yol2 ternary
		
		String result= (yas>=18 ? kilo>=50 ? "Kan verebilirsiniz." :"50 kilodan zay�flar kan veremez." :"18 ya��ndan k���kler kan veremez.");
		System.out.println(result);



		
		
		sc.close();
		
	}

}
