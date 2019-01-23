package br.com.mvc.springboot.projeto.service;

import java.util.List;

import br.com.mvc.springboot.projeto.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);

	Departamento buscarPorId(Long id);

	List<Departamento> buscarPorTodos();
}
