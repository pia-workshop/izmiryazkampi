package com.pia.yazkampi.repository;

import com.pia.yazkampi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String > {

    User findByUsername(String username);

    User findByUsernameAndAgeGreaterThan(String username, int age);

}
