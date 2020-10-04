/**
 * 
 */
package com.alura.apidata;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * @author evaristosrodrigues
 *
 */
public class CriandoPeriodoEntreDuasDatas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    LocalDate agora  = LocalDate.now();
    
    LocalDate dataEspecifica = LocalDate.of(2099, Month.JANUARY, 25);
    
    Period periodoDiferenca = Period.between(agora, dataEspecifica);
    
    System.out.println(periodoDiferenca);
	}

}
