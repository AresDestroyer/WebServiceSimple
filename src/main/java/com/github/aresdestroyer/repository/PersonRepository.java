package com.github.aresdestroyer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.github.aresdestroyer.domain.Person;
import com.github.aresdestroyer.model.PersonDto;
import com.github.aresdestroyer.model.PersonNameAndBandDto2;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p where p.name like\'L%\'")
    List<Person> findPersonL();

    @Modifying
    @Query("delete from Person p where p.reward = :reward")
    void deletePersonForReward(Long reward);

    @Modifying
    @Query("delete from Person p where p.alive = false")
    void deleteAllDead();

    @Query(value = "SELECT * FROM Person WHERE name like L%", nativeQuery = true)
    List<Person> findPersonLNative();

    // invent
    @Query(value = "SELECT p.name as name, b.name as bandName FROM Person p, Band b", nativeQuery = true)
    List<PersonNameAndBandDto2> findPersonNameAndBand();

    @Query("SELECT new com.github.aresdestroyer.model.PersonDto(p.name,p.band.name) FROM Person p")
    List<PersonDto> findPeopleDto();
}
