/**
 * 
 */
package com.alura.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author evaristosrodrigues
 *
 */
public class EscrevendoForEachComLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		//lambda
		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		//lambda
		palavras.forEach(p -> System.out.println(p));

	}

}
