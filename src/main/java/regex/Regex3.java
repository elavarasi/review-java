package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;

public class Regex3 {
	public static void main(String args[]) {
	       String line = "'<html>https://paypal.com/shoplist?a=166&b=2&s=5&f=998 'hjhjhj'kjjkjkjkjk7787887'https://paypal.com/shoplist?a=1&b=2&s=5&f=66'hjhjhj'kjjkjkjkjk7787887";
	       
	       Pattern pattern = Pattern.compile("http.*?\\?(.*?&.*?)[\"|\'|\\s]");
	       Matcher matcher = pattern.matcher(line);
	       
	       System.out.println(StringEscapeUtils.escapeHtml4(line));

	       int start = 0;
	       StringBuffer sb = new StringBuffer();
	       while (matcher.find()) {
	    	   System.out.println("startindex " + matcher.start(1));
	    	   System.out.println("startindex " + matcher.end(1));
	    	   System.out.println("parameters " + matcher.group(1));
	    	   sb.append(StringEscapeUtils.escapeHtml4(line.substring(start, matcher.start(1))));
	    	   sb.append(line.substring(matcher.start(1), matcher.end(1)));
	    	   start = matcher.end(1);
	       }    
	       sb.append(line.substring(start, line.length()));
	       System.out.println(sb);
	       
	       
	      
	}
}
