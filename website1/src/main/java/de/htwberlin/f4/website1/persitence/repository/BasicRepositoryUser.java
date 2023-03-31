package de.htwberlin.f4.website1.persitence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.htwberlin.f4.website1.persitence.entity.User;

@Repository
public interface BasicRepositoryUser extends CrudRepository<User, Long> {
}
