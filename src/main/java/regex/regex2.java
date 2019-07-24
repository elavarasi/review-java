package regex;

import java.util.Arrays;

public class regex2 {
	public static void main(String args[]) {
	       String str = "dfdf https://paypal.com/shoplist?a=1&b=2 dfdfdff"; 
	       String str1 = "'https://paypal.com/shoplist?a=1&b=2&s=5&f=99 'hjhjhj'kjjkjkjkjk7787887'https://paypal.com/shoplist?a=1&b=2&s=5&f=99'hjhjhj'kjjkjkjkjk7787887";
	       
	       
	        String[] arrOfStr = str1.split("http.*?\\?(.*?&.*?)[\"|\'|\\s]"); 
	        String[] arrOfStr1 = str1.split("(\\?<=((http.*?\\?(.*?&.*?)[\"|'|\\s])))"); 	
	        String[] arrOfStr2 = str1.split("(?<=http.*?\\?(.*?&.*?)[\"|\'|\\s]|\\?=http.*?\\?(.*?&.*?)[\"|\'|\\s])"); 
	        
	        
	        
	        for (String a : arrOfStr2) 
	            System.out.println(a); 
	        
	        
	        
	        System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));
	        System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
	        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));
	}
}
