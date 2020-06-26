package javaofficehours;
import java.util.Arrays;

public class day8_4 {
	
	public static void main(String[] args) {
        //Array içerisindeki tek sayıları 1 artırıp çift sayıları 1 azaltan
        //java methodu yazalım
        int [] arr ={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(donusum(arr)));
    }

public static int[] donusum(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a[i] = a[i] - 1;
            } else {
                a[i] = a[i] + 1;
                
            }
            
        }
        return a;     
    }
}