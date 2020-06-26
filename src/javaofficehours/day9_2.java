package javaofficehours;

import java.util.Arrays;

public class day9_2 {
	
    //Bir arrayi tersine çeviren java kodunu yazalým
	
	//Bir arrayin tersine ceviren kodu yazalim

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
	        System.out.println(Arrays.toString(reverse(arr)));
	    }

	public static int [] reverse (int[]arr){
		
	        for(int i=0; i<arr.length/2; i++){
	            int temp=arr[i];
	            arr[i]= arr[arr.length-i-1];
	            arr[arr.length-i-1]=temp;
	        }
	        return arr;
	    }
	
	}







