package ModelosDeMemoriaMetodos.Test;

import ModelosDeMemoriaMetodosExemplos.Paciente;

public class PacienteTest01 {
	public static void main(String args[]) {
		Paciente paciente = new Paciente();
		
		paciente.cadastraDadosPaciente();
		System.out.println(paciente);
		System.out.println("Idade do paciente: "+ paciente.calculaIdade(2024));
	}
}
