package org.studies.springdatareview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studies.springdatareview.orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {

}
