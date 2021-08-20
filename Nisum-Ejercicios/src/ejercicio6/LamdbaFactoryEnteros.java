package ejercicio6;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class LamdbaFactoryEnteros {
	public static void main(String... args) {
		for (String linea : args) {
			String[] parametros = linea.split(" ");
			try {
				if (parametros.length > 1) {
					switch (parametros[0]) {
					case "1":
						System.out.println(isOdd().test(Integer.parseInt(parametros[1])) ? "ODD" : "EVEN");
						break;
					case "2":
						System.out.println(isPrime().test(Integer.parseInt(parametros[1])) ? "PRIME" : "COMPOSITE");
						break;
					case "3":
						System.out.println(isPalindrome().test(Integer.parseInt(parametros[1])) ? "PALINDROME"
								: "NOT A PALINDROME");
						break;
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("Not an Integer");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public static Predicate<Integer> isOdd() {

		return i -> i % 2 == 1;

	}

	public static Predicate<Integer> isPrime() {

		return number -> {
			if (number < 1)
				return false;
			return Stream.iterate(2, i -> i <= Math.sqrt(number), i -> i + 1).allMatch(i -> number % i != 0);
		};
	}

	public static Predicate<Integer> isPalindrome() {
		return i -> {
			String intStrings = Integer.toString(i);
			return new StringBuilder(intStrings).reverse().toString().equals(intStrings);
		};
	}
}
