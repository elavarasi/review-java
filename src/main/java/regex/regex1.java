package regex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
	public static void main(String args[]) {
		String line = "This QT3000! OK?";

		
		
		String pattern = "(.*)(\\d+)(.*)";
				
				
		// Create a Patern Object
		Pattern r = Pattern.compile(pattern);
		
		// Create a matcher Object
		Matcher m = r.matcher(line);
		
		if(m.find()) {
			System.out.println("Fount value:" + m.groupCount());
			System.out.println("Fount value:" + m.group(0));
			System.out.println("Fount value:" + m.group(1));
			System.out.println("Fount value:" + m.group(2));
			System.out.println(m.end(2));
		}
		
		
		String hrefline = " el This is a href line https://paypal.com/shoplist?a=1&b=2";
		String pattern1 = "http.*?\\?(.*?&.*?)[\"|'|\\s]"; 
				
		
		
		Pattern testPattern = Pattern.compile(pattern1);
		Matcher testmatcher = testPattern.matcher(hrefline);
		
		System.out.println(testmatcher.find());
		
		System.out.println(testmatcher.start());
		
		List<String> allMatches = new ArrayList<String>();
		while (m.find()) {
			   allMatches.add(m.group());
		}
		
		System.out.println(allMatches.toArray(new String[0]));
		for (MatchResult match : allMatches(Pattern.compile("[abc]"), "abracadabra")) {
			  System.out.println(match.group() + " at " + match.start());
			}
		
		
		
		
	}
	public static Iterable<MatchResult> allMatches(
		      final Pattern p, final CharSequence input) {
		  return new Iterable<MatchResult>() {
		    public Iterator<MatchResult> iterator() {
		      return new Iterator<MatchResult>() {
		        // Use a matcher internally.
		        final Matcher matcher = p.matcher(input);
		        // Keep a match around that supports any interleaving of hasNext/next calls.
		        MatchResult pending;

		        public boolean hasNext() {
		          // Lazily fill pending, and avoid calling find() multiple times if the
		          // clients call hasNext() repeatedly before sampling via next().
		          if (pending == null && matcher.find()) {
		            pending = matcher.toMatchResult();
		          }
		          return pending != null;
		        }

		        public MatchResult next() {
		          // Fill pending if necessary (as when clients call next() without
		          // checking hasNext()), throw if not possible.
		          if (!hasNext()) { throw new NoSuchElementException(); }
		          // Consume pending so next call to hasNext() does a find().
		          MatchResult next = pending;
		          pending = null;
		          return next;
		        }

		        /** Required to satisfy the interface, but unsupported. */
		        public void remove() { throw new UnsupportedOperationException(); }
		      };
		    }
		  };
		}
	
}
