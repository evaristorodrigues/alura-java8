/**
 * 
 */
package com.alura.defaultmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author evaristosrodrigues
 *
 */
public class DefaultMethodForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new ImprimePalavras();
		//palavras.forEach(System.out::println);
		palavras.forEach(consumidor);

	}
	
}

 class ImprimePalavras implements Consumer<String>{

	@Override
	public void accept(String str) {
         System.out.println(str);			
	}
	
}

