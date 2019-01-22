package br.com.mvc.springboot.projeto.dao;

import java.util.List;

import br.com.mvc.springboot.projeto.domain.Cargo;

public interface CargoDao {
	
	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
