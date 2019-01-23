package br.com.mvc.springboot.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.mvc.springboot.projeto.dao.CargoDao;
import br.com.mvc.springboot.projeto.domain.Cargo;

@Service
@Transactional(readOnly = false) // readOnly = false valor default para a anotação
public class CargoServiceImpl implements CargoService {

	private CargoDao dao;

	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarPorTodos() {
		return dao.findAll();
	}

}
