package javaofficehours;

import java.util.Scanner;


public class day10_1 {
	public static void main(String[] args) {

		// Klavyeden girilen bir c�mlede belirtti�imiz bir
		        //harfin tekrar say�s�n� hesaplayal�m.

		       Scanner input = new Scanner(System.in);
		        System.out.println("L�tfen bir c�mle giriniz");
		        String cumle = input.nextLine();

		        System.out.println("Terar� bulunacak harf giriniz");
		        String harf = input.next();

		        int harfSayisi = 0;

		for (int i =0; i<cumle.length();i++){

		        	if(cumle.substring(i,i+1).equals(harf))
		                harfSayisi++;
		        }
		        System.out.println(harf + " harfi " +harfSayisi + " defa tekrar edilmi�tir.");
	input.close();
	}

}
