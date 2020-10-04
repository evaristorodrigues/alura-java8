/**
 * 
 */
package com.alura.apidata;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * @author evaristosrodrigues
 *
 */
public class LocalDateTimeParaCalendarEDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Pegar o  Instant do LocalDateTime
		LocalDateTime ldt = LocalDateTime.now();
		Instant instant = ldt.toInstant(ZoneOffset.UTC);
		
		//Criando o Date
		Date data = Date.from(instant);
		System.out.println(data);
		
		//Criando Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		System.out.println(calendar);
		
		//Criando LocalDateTime através do Date
		Instant dateInstant = data.toInstant();
		LocalDateTime ldt2 = LocalDateTime.ofInstant(dateInstant, ZoneId.systemDefault());
		System.out.println(ldt2);
		
		//Criando LocalDateTime traves do Calendar
		Instant CalendarInstant = calendar.toInstant();
		LocalDateTime ldt3 = LocalDateTime.ofInstant(CalendarInstant, ZoneId.systemDefault());
		System.out.println(ldt3);

	}

}
