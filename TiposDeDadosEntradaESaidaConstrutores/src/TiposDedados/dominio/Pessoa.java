package TiposDedados.dominio;

public class Pessoa {
	private String nome;
	private String rg;
	private String endereco;
	private String telefone;
	private String dtNascimento;
	private String profissao;

	public Pessoa() {}

	public Pessoa(String nome, String rg, String endereco, String telefone, String dtNascimento, String profissao) {
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.profissao = profissao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", dtNascimento=" + dtNascimento + ", profissao=" + profissao + "]";
	}


}


