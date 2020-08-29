package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * 'abba' --> "dog cat cat dog' ---> True
 * 'abba' --> "dog cat bus dog' ---> false
 * 'abba' ---> "dog cat dog" ----> false
 * 'abba' ---> "dog dog dog dog" --> false
 * @author bparimal
 *
 */
public class Str2WordPatternMatch {

	public static boolean patternMatch(String a,String b) {
		boolean result=true;
		String[] words=b.split(" ");
		if(a.length()!=words.length)
			return false;
		Map<String,String> str2Word = new HashMap<String,String>();
		for(int i=0;i<a.length();i++) {
			if(!str2Word.containsKey(a.charAt(i))) {
				str2Word.put(a.charAt(i)+"", words[i]);
			}
			else {
				if(!words[i].equals(str2Word.get(a.charAt(i))))
					return false;
			}
		}
		
		return result;
	}
	public static void main(String arg[]) {
		String a="abba";
		String b ="dog cat cat dog";
		System.out.println("mathc :"+ patternMatch(a,b));
	}
}
