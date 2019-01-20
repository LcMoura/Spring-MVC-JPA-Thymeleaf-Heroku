package br.com.mvc.springboot.projeto.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Cargo extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	@ManyToOne // se lê da direita para a esquerda (UM departamento para MUITO cargo)
	@JoinColumn(name = "id_departamento_fk") // chave estrangeira
	private Departamento departamento;

	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Funcionario> getFuncionario() {
		return funcionarios;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionarios = funcionario;
	}
}
