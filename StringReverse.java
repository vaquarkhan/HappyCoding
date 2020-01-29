

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {

		String name="Vaquar khan";
		
		System.out.println("1=" + reverse(name));

		System.out.println("2=" + reverse1(name));

		System.out.println("3=" + reverse2(name));

		System.out.println("4=" + reverse3(name));

	}

	public static String reverse(String string) {
		return Stream.of(string).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
	}

	public static String reverse1(String string) {
		return new StringBuilder(string).reverse().toString();
	}

	public static String reverse2(String string) {
		String reverse = "";
		char[] charArray = string.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse += charArray[i];
		}

		return reverse;
	}

	public static String reverse3(String string) {
		return Stream.of(string.split("")).reduce("", (reversed, character) -> character + reversed);

	}

}
