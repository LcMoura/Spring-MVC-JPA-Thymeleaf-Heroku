package br.com.mvc.springboot.projeto.dao;

import org.springframework.stereotype.Repository;

import br.com.mvc.springboot.projeto.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
