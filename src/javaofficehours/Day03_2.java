package javaofficehours;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		
//		 kullan�c�dan �niversite ka��nc� s�n�f ve fak�ltesini alan�m.
//		1. s�n�f ise;
//		�niversite giri� y�l�
//		2. s�n�f ise;
//		mimarl�k
//		syso(2. s�n�f mimarl�k ��rencisi)
//		m�hendislik:
//			syso(2. s�n�f m�hendislik  ��rencisi)
//			3. s�n�f ise;
//		mimarl�k
//		syso(2. s�n�f mimarl�k ��rencisi)
//		m�hendislik:
//		syso(2. s�n�f m�hendislik  ��rencisi)giri� y�l�
		
		
		
Scanner sc=new Scanner (System.in);
		
		System.out.println("L�tfen S�n�f�n�z giriniz");
		
		int yil = sc.nextInt();
		
		System.out.println("L�tfen fak�ltenizi giriniz.");
		String bolum =sc.next();
		
		switch (yil) {
		case 1:
			System.out.println("�niversiteye giri� y�l�");
			break;
			
		case 2:
			switch (bolum) {
			case "mimarl�k":
				System.out.println("2. s�n�f mimarl�k ��rencisi");
			break;
			case "m�hendislik":
				System.out.println("2. s�n�f m�hendislik ��rencisi");
				break;
				
			}
			break;
		case 3:
			switch (bolum) {
			case "mimarl�k":
				System.out.println("3. s�n�f mimarl�k ��rencisi");
			break;
			case "m�hendislik":
				System.out.println("3. s�n�f m�hendislik ��rencisi");
				break;
			
		}
			break;
			default:
				System.out.println("hatal� giri�");
			
	}

		sc.close();
	}

}
