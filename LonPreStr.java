package Logicc;

public class LonPreStr {
	public static String longestCommonPrefix(String[] strings) {
	    if (strings.length == 0) {
	        return "";  
	    }

	    for (int prefixl = 0; prefixl < strings[0].length(); prefixl++) {
	        char c = strings[0].charAt(prefixl);
	        for (int i = 1; i < strings.length; i++) {
	            if (prefixl >= strings[i].length() ||
	                 strings[i].charAt(prefixl) != c ) {
	               
	                return strings[i].substring(0, prefixl);
	            }
	        }
	    }
	    return strings[0];
	}
}
