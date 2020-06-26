package javaofficehours;

import java.util.Scanner;

public class day9_4 {
	    public static void main(String[] args) {
	        //Kullanicidan 5 adet sayi girsini isteyelim ve bu sayilari bi arryde tolayalim,
	        // icindeki cift sayialrin sayiisni yazdirlaim
	        Scanner sc= new Scanner(System.in);
	        System.out.println("lutfen 5 adet cift sayi giriniz");
	        int [] nums= {sc.nextInt(),sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt()};
	        int count =0;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]%2==0)
	                count++;
	        }
	        System.out.println("Girlen sayidaki cift sayi adedi: "+count);
	    sc.close();
	    }
	}
