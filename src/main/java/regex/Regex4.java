package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
	public static void main(String args[]) {
//	       String line = "'<html>https://paypal.com/shoplist?a=166&b=2&s=5&f=998 'hjhjhj'kjjkjkjkjk7787887'https://paypal.com/shoplist?a=1&b=2&s=5&f=66'hjhjhj'kjjkjkjkjk7787887";
//	       String line = "'&lt;html&gt;https://paypal.com/shoplist?a=166&amp;b=2&amp;s=5&amp;f=998 'hjhjhj'kjjkjkjkjk7787887'https://paypal.com/shoplist?a=1&amp;b=2&amp;s=5&amp;f=66'hjhjhj'kjjkjkjkjk7787887";
//		   String line = "<form action=/action_page.php?a=166&amp;b=2&amp;s=5&amp;f=998> First name:<br><input type=text value=Mickey><brLast? name:<br><input type=text name=lastname &amp; value=Mouse><br><br><input type=submit value=Submit></form>";
		   String line = "https://paypal.com/shoplist?a=1&amp;b=2";
	       Pattern pattern = Pattern.compile("\\?.*&amp;");
	       Matcher matcher = pattern.matcher(line);
	       
	       StringBuffer sb = new StringBuffer();
	       if (matcher.find()) {
	    	   System.out.println("Inside find");
	    	   sb.append(line.substring(0, matcher.start()));
	    	   sb.append(line.substring(matcher.start(), matcher.end()).replaceAll("&amp;", "&"));
	    	   sb.append(line.substring(matcher.end(), line.length()));
	       }
	       System.out.println("ORIGINAL LINE:" + line);
	       System.out.println("CHANGED LINE :" + sb);
	}
}
