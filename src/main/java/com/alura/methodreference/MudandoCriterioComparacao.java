/**
 * 
 */
package com.alura.methodreference;

import java.util.ArrayList;
import java.util.List;

/**
 * @author evaristosrodrigues
 *
 */
public class MudandoCriterioComparacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		//Lambda
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Lambda
		palavras.forEach(p -> System.out.println(p));
	}

}
