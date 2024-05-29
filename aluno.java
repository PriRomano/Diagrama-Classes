package DiagramaClasses;

import java.util.Collection;

public class aluno {

	private String nome;

	private String cpf;

	private String sexo;

	private Date data_nascimento;

	private endereço endereco;

	private Collection<contato> contato;

	public boolean validaCpf() {
		return false;
	}

	public boolean validaDataNasc() {
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(endereço endereco) {
		this.endereco = endereco;
	}

	public Collection<contato> getContato() {
		return contato;
	}

	public void setContato(Collection<contato> contato) {
		this.contato = contato;
	}


	
}
