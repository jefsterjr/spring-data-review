package org.studies.springdatareview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studies.springdatareview.orm.UnidadeTrabalho;

@Repository
public interface UnidadeTrabalhoRepository extends CrudRepository<UnidadeTrabalho, Integer> {

}
