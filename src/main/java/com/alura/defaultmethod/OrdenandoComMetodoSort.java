/**
 * 
 */
package com.alura.defaultmethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author evaristosrodrigues
 *
 */
public class OrdenandoComMetodoSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Comparator<String> comparator = new CompararPorTamanaho();
		palavras.sort(comparator);
		
		Consumer<String> consumidor = new ConsumerImprimePalavras();
		palavras.forEach(consumidor );
	}

}

class CompararPorTamanaho implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		if( a.length() < b.length()){
			return -1;
		}else if ( a.length() > b.length()) {
			return 1;
		}
		return 0;
	}
	
}

class ConsumerImprimePalavras implements Consumer<String>{

	@Override
	public void accept(String str) {
        System.out.println(str);			
	}
	
}
