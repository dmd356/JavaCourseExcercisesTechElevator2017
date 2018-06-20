package com.techelevator;

public class Exercises {

	/*
	 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 helloName("Bob") → "Hello Bob!"
	 helloName("Alice") → "Hello Alice!"
	 helloName("X") → "Hello X!"
	 DONE
	 */
	public String helloName(String name) {
		String oh = "Hello " + name + "!";
		return oh;
	}

	/*
	 Given two strings, a and b, return the result of putting them together in the order abba, 
	 e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 makeAbba("Hi", "Bye") → "HiByeByeHi"
	 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 makeAbba("What", "Up") → "WhatUpUpWhat"
	 DONE
	 */
	public String makeAbba(String a, String b) {
		String abba =  a + b + b + a;
		return abba;
	}

	/*
	 The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
	 the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the 
	 HTML string with tags around the word, e.g. "<i>Yay</i>".
	 makeTags("i", "Yay") → "<i>Yay</i>"
	 makeTags("i", "Hello") → "<i>Hello</i>"
	 makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 DONE
	 */
	public String makeTags(String tag, String word) {
		return "<" + tag +">" + word + "</" + tag +">" ;
	}

	/*
	 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the 
	 middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting 
	 at index i and going up to but not including index j.
	 makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 makeOutWord("[[]]", "word") → "[[word]]"
	 */
	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2); 
	}

	/*
	 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string 
	 length will be at least 2.
	 extraEnd("Hello") → "lololo"
	 extraEnd("ab") → "ababab"
	 extraEnd("Hi") → "HiHiHi"
	 DONE
	 */
	public String extraEnd(String str) {
		
	String extra = str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
	return extra;
	}

	/*
	 Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the 
	 string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" 
	 yields the empty string "". Note that str.length() returns the length of a string.
	 firstTwo("Hello") → "He"
	 firstTwo("abcdefg") → "ab"
	 firstTwo("ab") → "ab"
	 DONE
	 */
	public String firstTwo(String str) {
		int strlength = str.length();
		if (strlength < 2)
			return str;
		return str.substring(0, 2);
		
	}

	/*
	 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 firstHalf("WooHoo") → "Woo"
	 firstHalf("HelloThere") → "Hello"
	 firstHalf("abcdef") → "abc"
	 DONE
	 */
	public String firstHalf(String str) {
		int strlength = str.length();
		
		return str.substring(0, strlength / 2);
	}

	/*
	 Given a string, return a version without the first and last char, so "Hello" yields "ell". 
	 The string length will be at least 2.
	 withoutEnd("Hello") → "ell"
	 withoutEnd("java") → "av"
	 withoutEnd("coding") → "odin"
	 DONE
	 */
	public String withoutEnd(String str) {
		int strlength = str.length();
		
		return str.substring(1, strlength - 1);
	}
	
	/*
	 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string 
	 on the outside and the longer string on the inside. The strings will not be the same length, but 
	 they may be empty (length 0).
	 comboString("Hello", "hi") → "hiHellohi"
	 comboString("hi", "Hello") → "hiHellohi"
	 comboString("aaa", "b") → "baaab"
	 DONE
	 */
	public String comboString(String a, String b) {
		if (a.length() < b.length()){
			return a+b+a;
		}
		else {
			return b+a+b;
		}
	}
	
	/*
	 Given 2 strings, return their concatenation, except omit the first char of each. The strings will 
	 be at least length 1.
	 nonStart("Hello", "There") → "ellohere"
	 nonStart("java", "code") → "avaode"
	 nonStart("shotl", "java") → "hotlava"
	 DONE
	 */
	public String nonStart(String a, String b) {
		String answer = a.substring(1) + b.substring(1);
		return answer;
	}

	/*
	 Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
	 The string length will be at least 2.
	 left2("Hello") → "lloHe"
	 left2("java") → "vaja"
	 left2("Hi") → "Hi"
	 */
	public String left2(String str) {
		return str.substring(2, str.length()) + str.substring(0, 2);
	}

	/*
	 Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. 
	 The string length will be at least 2.
	 right2("Hello") → "loHel"
	 right2("java") → "vaja"
	 right2("Hi") → "Hi"
	 DONE
	 */
	public String right2(String str) {
		
		return str.substring(str.length() -2, str.length()) + str.substring(0, str.length() - 2);
		
	}

	/*
	 Given a string, return a string length 1 from its front, unless front is false, in which case 
	 return a string length 1 from its back. The string will be non-empty.
	 theEnd("Hello", true) → "H"
	 theEnd("Hello", false) → "o"
	 theEnd("oh", true) → "o"
	 DONE
	 */
	public String theEnd(String str, boolean front) {
		if(front == true){
			return str.substring(0, 1);
		}
		else
			return str.substring(str.length() - 1);
	}

	/*
	 Given a string, return a version without both the first and last char of the string. The string 
	 may be any length, including 0.
	 withouEnd2("Hello") → "ell"
	 withouEnd2("abc") → "b"
	 withouEnd2("ab") → ""
	 DONE
	 */
	public String withouEnd2(String str) {
		if(str.length() < 3)
		return "";
		
		return str.substring(1, str.length() - 1);
		
	}

	/*
	 Given a string of even length, return a string made of the middle two chars, so the string "string" 
	 yields "ri". The string length will be at least 2.
	 middleTwo("string") → "ri"
	 middleTwo("code") → "od"
	 middleTwo("Practice") → "ct"
	 DONE
	 */
	public String middleTwo(String str) {
		int len = str.length();
		return str.substring(len/2 - 1, len/2 +1);
	}

	/*
	 Given a string, return true if it ends in "ly".
	 endsLy("oddly") → true
	 endsLy("y") → false
	 endsLy("oddy") → false
	 DONE
	 */
	public boolean endsLy(String str) {
		int len = str.length();
		if (str.endsWith("ly")){
			return true;
		}
		return false;
	}

	/*
	 Given a string and an int n, return a string made of the first and last n chars from the string. The 
	 string length will be at least n.
	 nTwice("Hello", 2) → "Helo"
	 nTwice("Chocolate", 3) → "Choate"
	 nTwice("Chocolate", 1) → "Ce"
	 DONE
	 */
	public String nTwice(String str, int n) {
		
			return str.substring(0, n) + str.substring(str.length() - n);
	}

	/*
	 Given a string and an index, return a string length 2 starting at the given index. If the index is 
	 too big or too small to define a string length 2, use the first 2 chars. The string length will be 
	 at least 2.
	 twoChar("java", 0) → "ja"
	 twoChar("java", 2) → "va"
	 twoChar("java", 3) → "ja"
	 DONE
	 */
	public String twoChar(String str, int index) {
		if(index + 2 > str.length() || index < 0){
			return str.substring(0, 2);
		}
		return str.substring(index, index + 2);
	}

	/*
	 Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
	 The string length will be at least 3.
	 middleThree("Candy") → "and"
	 middleThree("and") → "and"
	 middleThree("solving") → "lvi"
	 DONE
	 */
	public String middleThree(String str) {
		
		return str.substring((str.length() / 2) -  1, (str.length() / 2) + 2 );
	}

	/*
	 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with 
	 "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
	 to compare 2 strings.
	 hasBad("badxx") → true
	 hasBad("xbadxx") → true
	 hasBad("xxbadxx") → false
	 DONE
	 */
	public boolean hasBad(String str) {
		if (str.length() <= 2) 
				return false;
        if (str.length() == 3) 
        	return str.substring(0, 3).equals("bad");
        return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
		
	}

	/*
	 Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	 stringTimes("Hi", 2) → "HiHi"
	 stringTimes("Hi", 3) → "HiHiHi"
	 stringTimes("Hi", 1) → "Hi"
	 DONE
	 */
	public String stringTimes(String str, int n) {
		String result = "";
		for(int i = 0; i < n; i++){
			result += str;
		}
		return result;
	}

	/*
	 Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or 
	 whatever is there if the string is less than length 3. Return n copies of the front;
	 frontTimes("Chocolate", 2) → "ChoCho"
	 frontTimes("Chocolate", 3) → "ChoChoCho"
	 frontTimes("Abc", 3) → "AbcAbcAbc"
	 DONE
	 */
	public String frontTimes(String str, int n) {
		int length = 3;
		if(str.length() < 3) {
			length = str.length();
		}
		String front = str.substring(0, length);
		String answer = "";
		for(int i = 0; i<n; i++){
				answer += front;
		}
		return answer;
		}


	/*
	 Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 countXX("abcxx") → 1
	 countXX("xxx") → 2
	 countXX("xxxx") → 
	 DONE
	 */
	public int countXX(String str) {
		int count = 0;
		for(int i = 0; i < str.length() - 1; i++){
			if(str.substring(i, i + 2).equals("xx")){
				count++;
			}
		}
		return count;
	}

	/*
	 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 doubleX("axxbb") → true
	 doubleX("axaxax") → false
	 doubleX("xxxxx") → true
	 DONE
	 */
	public boolean doubleX(String str) {
		int x = str.indexOf("x");
		if(x == -1){
			return false;
		}else if (x + 1 >= str.length()){
			return false;
		}else{
			return str.substring(x+1, x+2).equals("x");
		}
			
		
		
	}

	/*
	 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 stringBits("Hello") → "Hlo"
	 stringBits("Hi") → "H"
	 stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i+=2){
			result = result + str.substring(i, i + 1);
		}
		return result;
	}

	/*
	 Given a non-empty string like "Code" return a string like "CCoCodCode".
	 stringSplosion("Code") → "CCoCodCode"
	 stringSplosion("abc") → "aababc"
	 stringSplosion("ab") → "aab"
	 DONE
	 */
	public String stringSplosion(String str) {
		
		 String result = "";

	        for ( int i = 0; i < str.length(); i++ )
	        {
	            result += str.substring( 0, i + 1 );
	        }
	        return result;
	}

	/*
	 Given a string, return the count of the number of times that a substring length 2 appears in the string and 
	 also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 last2("hixxhi") → 1
	 last2("xaxxaxaxx") → 1
	 last2("axxxaaxx") → 2
	 done
	 */
	public int last2(String str) {
		
		if(str.length() < 2){
			return 0;
		}
		int minusTwo = str.length() - 2;
		String lastTwo = str.substring(minusTwo);
		int answer = 0;
		for(int i = 0; i < str.length() - 2; i++){
			String plus = str.substring(i, i+2);
			if(plus.equals(lastTwo)){
				answer++;
			}
		}
		return answer;
		
	}

	/*
	 Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end 
	 should not be removed.
	 stringX("xxHxix") → "xHix"
	 stringX("abxxxcd") → "abcd"
	 stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str) {
		int strLength = str.length();
		if(strLength < 3){
			return str;
			
		}
		
		String stringRep = str.substring(1,  (strLength - 1));
		String stringOne = stringRep.replace("x", "");
		String stringAnswer = str.charAt(0) + stringOne + str.charAt(strLength - 1);
		return stringAnswer;
		
		
	}

	/*
	 Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 altPairs("kitten") → "kien"
	 altPairs("Chocolate") → "Chole"
	 altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i+=4) {
			result += str.charAt(i);
			if(str.length() > i+1)
			result += str.charAt(i+1);
		}
	

		return result;
		
		
	}

	/*
	 Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but 
	 the "a" can be any char. The "yak" strings will not overlap.
	 stringYak("yakpak") → "pak"
	 stringYak("pakyak") → "pak"
	 stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str) {
		String[] parts = str.split("yak");
		String result = new String();
		
		for (int i = 0; i < parts.length; i++){
			result += parts[i];
		}
		return result;
	
}
}
