package br.com.mvc.springboot.projeto.dao;

import java.util.List;

import br.com.mvc.springboot.projeto.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();
}
