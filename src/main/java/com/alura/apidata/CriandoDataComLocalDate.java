/**
 * 
 */
package com.alura.apidata;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author evaristosrodrigues
 *
 */
public class CriandoDataComLocalDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
    System.out.println(data);
	}

}
