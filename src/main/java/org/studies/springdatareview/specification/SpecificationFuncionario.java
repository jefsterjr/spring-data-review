package org.studies.springdatareview.specification;

import org.springframework.data.jpa.domain.Specification;
import org.studies.springdatareview.orm.Funcionario;

import java.time.LocalDate;

public class SpecificationFuncionario {

    private SpecificationFuncionario() {
    }

    public static Specification<Funcionario> nome(String nome) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
    }

    public static Specification<Funcionario> cpf(String cpf) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("cpf"), cpf);
    }

    public static Specification<Funcionario> salario(Double salario) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.greaterThan(root.get("salario"), salario);
    }

    public static Specification<Funcionario> dataContratacao(LocalDate dataContratacao) {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.greaterThan(root.get("dataContratacao"), dataContratacao);
    }

}
