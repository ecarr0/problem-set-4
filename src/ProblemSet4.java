/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		System.out.println("surroundMe : ");
		System.out.println(surroundMe("<<>>", "abc")); //returns <<abc>>
		System.out.println(surroundMe("[[]]", "xyz")); //returns [[xyz]]
		System.out.println(surroundMe("abc", "abc")); //returns null
		System.out.println(surroundMe("(())", "qwerty")); //returns null
		System.out.println(surroundMe(null, "abc")); //returns null
		System.out.println(surroundMe("<<>>", null)); //returns null
		System.out.println();
		
		System.out.println("endsMeet : ");
		System.out.println(endsMeet("qwerty", 2)); // qwty
		System.out.println(endsMeet("basketball", 3)); //basall
		System.out.println(endsMeet("qwerty", -1)); //returns null
		System.out.println(endsMeet("basketball", 0)); //returns null
		System.out.println(endsMeet("qwerty", 9)); //returns null
		System.out.println(endsMeet("programming", 2)); //returns null
		System.out.println(endsMeet(null, 1)); //returns null
		System.out.println();
		
		System.out.println("middleMan : ");
		System.out.println(middleMan("candy")); // returns and
		System.out.println(middleMan("programming")); //  returns ram
		System.out.println(middleMan("even")); //returns null
		System.out.println(middleMan(null)); // returns null
		System.out.println();
		
		System.out.println("doubleVision : ");
		System.out.println(doubleVision("qwerty")); //returns qqwweerrttyy
		System.out.println(doubleVision("a")); //aa
		System.out.println(doubleVision(null)); //returns null
		System.out.println();
		
		System.out.println("centered: ");
		System.out.println(centered("candy", "and")); // true
		System.out.println(centered("programming", "ram")); //true
		System.out.println(centered("qwerty", "qwe")); // false
		System.out.println(centered("qwerty", "er")); //false
		System.out.println(centered("qwerty", null)); //false
		System.out.println(centered(null, "abc")); //false
		System.out.println(centered(null, null)); //false
		System.out.println();
		
		System.out.println("upOrDown: ");
		System.out.println(upOrDown(12.7, 'r')); // returns 13
		System.out.println(upOrDown(12.2, 'r')); // returns 12
		System.out.println(upOrDown(12.7, 'f')); //returns 12
		System.out.println(upOrDown(12.2, 'c')); //returns 13
		System.out.println(upOrDown(12.7, 'x')); //returns -1
		System.out.println();
		
		System.out.println("countMe :");
		System.out.println(countMe("these are just some sample words", 'e')); //returns 3
		System.out.println(countMe(null, 'n')); // returns -1
		System.out.println(countMe("and some more sample words", '+')); //returns -1
		System.out.println(countMe("one more batch of sample words", 'h')); // returns 1
		System.out.println();
		
		System.out.println("isNotEqual : ");
		System.out.println(isNotEqual("is not is not is")); // return false
		System.out.println(isNotEqual("is not is not is not")); //return true
		System.out.println(isNotEqual(null)); //return false
		System.out.println();
		
		System.out.println("triplets :");
		System.out.println(triplets("abbbccccd")); //returns 3
		System.out.println(triplets("aaabbbbccccc")); //returns 6
		System.out.println(triplets(null)); //returns -1
		System.out.println(triplets("abbb1ccc")); //returns -1
		System.out.println(triplets("aaa bbb")); //returns -1
		System.out.println();
		
		System.out.println("addme");
		System.out.println(addMe("a123b456c789", true));//returns 45
		System.out.println(addMe("a123b456c789", false)); //returns 1368
		System.out.println(addMe(null, true)); //returns -1
		System.out.println(addMe("abc 123 def", false)); //returns -1
		System.out.println();
	}	
	
	public static String surroundMe(String out, String in) {
		String initChar;
		String endChar;
		if(in == null || out == null) {
			return null;
		}
		if(in.length() == 3 && out.length() == 4) {
			initChar = out.substring(0, 2);
			endChar = out.substring(2, 4);
			String str = initChar + in + endChar;
			return str;
			
		}
		else {
			return null; 
		}
	}
	
	public static String endsMeet(String str, int n) {
		if(str == null || n % 2 == 0 || n <= 0 || n > str.length()) {
			return null;
		}
		else {
			String initStr = str.substring(0, n);
			String endStr = str.substring(str.length() - n, str.length());
			return initStr + endStr;
		}
	}
	
	public static String middleMan(String str) {
		if(str == null || str.length() % 2 == 0) {
			return null;
		}
		else {
			int middleChar = str.length() / 2 + 1;
			String middleStr = str.substring(middleChar - 2, middleChar + 1);
			return middleStr;
		}
	}
	
	public static String doubleVision(String str) {
		if(str == null) {
			return null;
		}
		else {
			String returnStr = "";
			for(int i = 0; i < str.length(); i++) {
				returnStr = returnStr + Character.toString(str.charAt(i));
				returnStr = returnStr + Character.toString(str.charAt(i));
			}
			return returnStr;
		}
	}
	
	public static boolean centered(String str, String target) {
		if(str == null || target == null || target.length() != 3 ) {
			return false;
		}
		else if(str.length() % 2 == 0) {
			String test1 = str.substring(str.length() / 2, str.length() / 2 + 3);
			//System.out.println(test1);
			String test2 = str.substring(str.length() / 2 - 1, str.length()/2 + 2);
			//System.out.println(test2);
			if(test1.equals(target) || test2.equals(target)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			String test3 = str.substring(str.length() / 2 - 1, str.length()/2 + 2);
			//System.out.println(test3);
			if(test3.equals(target)) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public static int upOrDown(double number, char operation) {
		switch (operation) {
			case 'c' :
				return (int)Math.ceil(number);
			case 'f' :
				return (int)Math.floor(number);
			case 'r' :
				return (int)Math.round(number);
			default :
				return -1;
		}
	}
	
	public static int countMe(String text, char end) {
		if(text != null && (end >= 'a' && end <= 'z' || end >= 'A' && end <= 'Z')) {
			int count = 0;
			for(int i = 0; i < text.length(); i++) {
				if(text.charAt(i) == end && text.charAt(i+1) == ' ') {
					count++;
				}
			}
			if(count > 0) {
				return count;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
	
	public static boolean isNotEqual(String str) {
		if (str == null) {
			return false;
		}
		else {
			int countIs = 0;
			int countNot = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.length() >= i + 2 ) {
					if(str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i + 2) == 't') {
						countNot++;
					}
				}
				if(str.length() >= i + 1) {
					if(str.charAt(i) == 'i' && str.charAt(i+1) == 's') {
						countIs++;
					}
				}
			}
			if(countIs == countNot) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public static int triplets(String str) {
		if(str == null) { 
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
				if(!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) || str.charAt(i) == ' ') {
					return -1;
				}
		}
		int countTrip = 0;
		//char test;
		for(int i = 0; i < str.length(); i++) {
			if(str.length() > i + 2) {
				if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
					countTrip++;
				}
			}
		}
			return countTrip;
	}

	public static int addMe (String str, boolean digits) {
		for(int j = 0; j < str.length(); j++) {
			if(str.charAt(j) == ' ') {
				return -1;
			}
		}
		if(digits) {
			int sum = 0;
			for(int i = 0; i < str.length(); i++) {
				if(Character.isDigit(str.charAt(i))) {
					sum += Character.getNumericValue(str.charAt(i));
				}
			}
			if (sum > 0) {
				return sum;
			}
			else {
				return -1;
			}
		}
		else {
			int sumNums = 0;
			int n = 0;
			for(int i = 0; i < str.length(); i++) {
				if(Character.isDigit(str.charAt(i))) {
					int k = i + 1;
					n = 0;
					while(Character.isDigit(k)) {
						n += 1;
						k++;
					}	
				}
				String case1 = str.substring(i, i + n);
				sumNums += Integer.parseInt(case1);
			}
			if (sumNums > 0) {
				return sumNums;
			}
			else {
				return -1;
			}
		}
	}
}


