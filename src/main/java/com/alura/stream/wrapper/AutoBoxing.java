/**
 * 
 */
package com.alura.stream.wrapper;

/**
 * @author evaristosrodrigues
 *
 */
public class AutoBoxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Até o Java 1.4 não era possível executar operações em cima de ::wrappers::.
		 * Por exemplo, para somar 1 em um Integer era necessário o seguinte código:
		 */

		Integer intWrapper = Integer.valueOf(1);
		int intPrimitive = intWrapper.intValue();
		intPrimitive++;
		intWrapper = Integer.valueOf(intPrimitive);
		/**
		 * A partir do Java 5, foi incluído um recurso chamado autoboxing. O próprio
		 * compilador é responsável por transformar os ::wrappers:: em primitivos
		 * (::unboxing::) e primitivos em ::wrappers:: (::boxing::). A mesma operação de
		 * somar 1 em um Integer agora é:
		 */

		Integer intWrapper2 = Integer.valueOf(1);
		intWrapper2++;

	}

}
