package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FareDAO  extends CrudRepository<Fare,Integer> {

}
