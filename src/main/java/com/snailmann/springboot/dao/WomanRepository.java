package com.snailmann.springboot.dao;

import com.snailmann.springboot.entity.Woman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Woman: the entity we want to operate in WomanController
 * Integer: the type of primary key (id)
 *
 */
@Repository
public interface WomanRepository extends JpaRepository<Woman,Integer> {

    /**
     * find all woman by her age
     * it is a interface and it not exist in JpaRepository.
     * if you want to define a interface belong to yourself,
     * your name of interface must follow the naming speciification of JpaRepository
     * @param age
     * @return
     */
    public List<Woman> findByAge(Integer age);


}
