package br.com.mvc.springboot.projeto.service;

import java.util.List;

import br.com.mvc.springboot.projeto.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void excluir(Long id);

	Funcionario buscarPorId(Long id);

	List<Funcionario> buscarPorTodos();
}
