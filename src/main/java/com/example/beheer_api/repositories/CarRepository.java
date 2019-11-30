package com.example.beheer_api.repositories;

import com.example.beheer_api.models.Car;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.repository.CrudRepository;


public interface CarRepository extends CrudRepository<Car, Long> {
}
