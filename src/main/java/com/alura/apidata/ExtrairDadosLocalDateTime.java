/**
 * 
 */
package com.alura.apidata;

import java.time.LocalDateTime;

/**
 * @author evaristosrodrigues
 *
 */
public class ExtrairDadosLocalDateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.of(2014,12,15,13,0);
		System.out.println(now.getDayOfMonth()); // 15
		System.out.println(now.getDayOfYear());  // 349
		System.out.println(now.getHour());       // 13
		System.out.println(now.getMinute());     // 0
		System.out.println(now.getYear());       // 2014
		System.out.println(now.getDayOfWeek());  // MONDAY
		System.out.println(now.getMonthValue()); // 12
		System.out.println(now.getMonth());      // DECEMBER

	}

}
