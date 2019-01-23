package br.com.mvc.springboot.projeto.service;

import java.util.List;

import br.com.mvc.springboot.projeto.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);

	void editar(Cargo cargo);

	void excluir(Long id);

	Cargo buscarPorId(Long id);

	List<Cargo> buscarPorTodos();

}
