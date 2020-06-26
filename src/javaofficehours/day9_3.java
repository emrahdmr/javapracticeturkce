package javaofficehours;

import java.util.ArrayList;
import java.util.Arrays;

public class day9_3 {

	    public static void main(String[] args) {
	        //String array dizisindeki 4 harfli kelimelri return eden methodu yazyniz
	        String [] str={"sali", "cuma", "pazar","persembe"};
	        System.out.println(Arrays.toString(dortHarfli(str)));
	    }
	    public static String [] dortHarfli(String[] str){
	        ArrayList<String> list= new ArrayList<>();
	        for(String w: str) {
	            if (w.length() == 4) {
	                list.add(w);
	            }
	        }
	        
	    String[] result = list.toArray(new String[list.size()]);
	        return result;

	    }
	}