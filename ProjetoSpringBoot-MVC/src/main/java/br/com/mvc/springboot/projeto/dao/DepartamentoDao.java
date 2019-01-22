package br.com.mvc.springboot.projeto.dao;

import java.util.List;

import br.com.mvc.springboot.projeto.domain.Departamento;

public interface DepartamentoDao {

	void save(Departamento departamento);

	void update(Departamento departamento);

	void delete(Long id);

	Departamento findById(Long id);

	List<Departamento> findAll();
}
