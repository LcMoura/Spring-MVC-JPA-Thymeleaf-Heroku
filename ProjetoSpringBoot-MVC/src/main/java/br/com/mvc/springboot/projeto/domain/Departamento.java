package br.com.mvc.springboot.projeto.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS") // setar a tabela departamento
public class Departamento extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60) // setar a coluna e suas características
	private String nome;
	
	@OneToMany(mappedBy = "departamentos") // Relacionamento Bidirecional e o lado fraco é departamento
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
