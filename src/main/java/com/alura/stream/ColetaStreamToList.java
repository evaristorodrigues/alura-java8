/**
 * 
 */
package com.alura.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.alura.model.Curso;

/**
 * @author evaristosrodrigues
 *
 */
public class ColetaStreamToList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		List<Curso> listaCurso = cursos.stream()
		.filter(c-> c.getAlunos() > 50)
		.collect(Collectors.toList());//transforma em List
		
		listaCurso.forEach(c -> System.out.println(c.getNome()));
	}

}
