package ClassesEObjetos.test;

import ClassesEObjetos.dominio.Aluno;
import ClassesEObjetos.dominio.Curso;

public class AlunoTest01 {

	public static void main(String[] args) {
		Curso curso1 = new Curso ("Analise e Desenvolvimento de Sistemas", 2);
		Curso curso2 = new Curso ();
		Aluno aluno1 = new Aluno("Goku", 20, 300050, curso1);
		Aluno aluno2 = new Aluno();

		curso2.setNome("Ciencia da computação");
		curso2.setDuracao(5);

		aluno2.setNome("Hisoka");
		aluno2.setIdade(19);
		aluno2.setRGM(30999600);
		aluno2.setCurso(curso2);

		System.out.println(aluno1);
		System.out.println("-------------");
		System.out.println(aluno2);
	}
}