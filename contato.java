package DiagramaClasses;

public class contato {

	private String tipo_contato;

	private String numero;

	private int ddd;

	private aluno aluno;

	public boolean validaContato() {
		return false;
	}

	public String getTipo_contato() {
		return tipo_contato;
	}

	public void setTipo_contato(String tipo_contato) {
		this.tipo_contato = tipo_contato;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public aluno getAluno() {
		return aluno;
	}

	public void setAluno(aluno aluno) {
		this.aluno = aluno;
	}


	
}
