/**
 * 
 */
package com.alura.apidata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author evaristosrodrigues
 *
 */
public class FormatadorData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	LocalDate agora  = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println(agora.format(formatter));
	
	}

}
