package com.example.beheer_api.repositories;

import com.example.beheer_api.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
