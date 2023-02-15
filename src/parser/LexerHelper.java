package parser;

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
			return text.charAt(1);
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
