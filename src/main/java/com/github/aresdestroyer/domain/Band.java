package com.github.aresdestroyer.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Band {

    @Id
    @GeneratedValue(generator = "sequenceBand", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequenceBand", allocationSize = 1)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "band", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Person> person;

}
