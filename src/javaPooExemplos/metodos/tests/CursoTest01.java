package javaPooExemplos.metodos.tests;

import javaPooExemplos.metodos.Curso;

public class CursoTest01 {
	public static void main(String args[]) {
		Curso curso = new Curso();
		
		curso.cadastraCurso();
		curso.calculaTotalMensalidade();
		
		System.out.println(curso);
	}
}
