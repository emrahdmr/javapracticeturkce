package javaofficehours;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		
//		 kullanýcýdan üniversite kaçýncý sýnýf ve fakültesini alaným.
//		1. sýnýf ise;
//		üniversite giriþ yýlý
//		2. sýnýf ise;
//		mimarlýk
//		syso(2. sýnýf mimarlýk öðrencisi)
//		mühendislik:
//			syso(2. sýnýf mühendislik  öðrencisi)
//			3. sýnýf ise;
//		mimarlýk
//		syso(2. sýnýf mimarlýk öðrencisi)
//		mühendislik:
//		syso(2. sýnýf mühendislik  öðrencisi)giriþ yýlý
		
		
		
Scanner sc=new Scanner (System.in);
		
		System.out.println("Lütfen Sýnýfýnýz giriniz");
		
		int yil = sc.nextInt();
		
		System.out.println("Lütfen fakültenizi giriniz.");
		String bolum =sc.next();
		
		switch (yil) {
		case 1:
			System.out.println("üniversiteye giriþ yýlý");
			break;
			
		case 2:
			switch (bolum) {
			case "mimarlýk":
				System.out.println("2. sýnýf mimarlýk öðrencisi");
			break;
			case "mühendislik":
				System.out.println("2. sýnýf mühendislik öðrencisi");
				break;
				
			}
			break;
		case 3:
			switch (bolum) {
			case "mimarlýk":
				System.out.println("3. sýnýf mimarlýk öðrencisi");
			break;
			case "mühendislik":
				System.out.println("3. sýnýf mühendislik öðrencisi");
				break;
			
		}
			break;
			default:
				System.out.println("hatalý giriþ");
			
	}

		sc.close();
	}

}
