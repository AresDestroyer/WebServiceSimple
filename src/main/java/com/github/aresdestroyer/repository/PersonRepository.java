package com.github.aresdestroyer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.github.aresdestroyer.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p where p.name like\'L%\'")
    List<Person> findPersonL();

    @Modifying
    @Query("delete from Person p where p.reward = :reward")
    void deletePersonForReward(Long reward);

    @Modifying
    @Query("delete from Person p where p.alive = false")
    void deleteAllDead();
}
