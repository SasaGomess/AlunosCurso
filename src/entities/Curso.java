package entities;

import java.util.Objects;

public class Curso {
	private Integer codAluno;
	private String nome;

	
	public Curso(Integer codAluno, String nome) {
		this.codAluno = codAluno;
		this.nome = nome;
	}

	public Integer getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(Integer codAluno) {
		this.codAluno = codAluno;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codAluno, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(codAluno, other.codAluno) && Objects.equals(nome, other.nome);
	}
	
}
