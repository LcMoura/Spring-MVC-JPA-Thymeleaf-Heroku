package br.com.mvc.springboot.projeto.dao;

import org.springframework.stereotype.Repository;

import br.com.mvc.springboot.projeto.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
