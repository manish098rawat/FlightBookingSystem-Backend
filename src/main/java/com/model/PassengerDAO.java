package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PassengerDAO  extends CrudRepository<Passenger,Integer>{

}
