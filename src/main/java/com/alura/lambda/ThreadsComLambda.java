/**
 * 
 */
package com.alura.lambda;

/**
 * @author evaristosrodrigues
 *
 */
public class ThreadsComLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   new Thread(() -> System.out.println("Executando um Runnable")).start();
	}

}
