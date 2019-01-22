package br.com.mvc.springboot.projeto.dao;

import org.springframework.stereotype.Repository;

import br.com.mvc.springboot.projeto.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

}
