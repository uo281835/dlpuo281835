package parser;

import ast.tipos.Char;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String text) {
		try {
			if(text.length()==3)
				return text.charAt(1);
			else if(text.equals("\'\\n\'"))
				return '\n';
			else if(text.equals("\'\\t\'"))
				return '\t';
			else {
				String s = text.substring(2,text.length()-1);
				int character = Integer.parseInt(s);
				return (char) character;
			}

		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return ' ';
	}

	public static Double lexemeToReal(String text) {
		try {
			return Double.parseDouble(text);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1.;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods
	
}
