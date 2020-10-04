/**
 * 
 */
package com.alura.methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author evaristosrodrigues
 *
 */
public class EscrevendoComparingComMethodReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//Method Reference
		palavras.sort(Comparator.comparing(String::length));
		
		//Lambda
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Lambda
		palavras.forEach(p -> System.out.println(p));
	}

}
