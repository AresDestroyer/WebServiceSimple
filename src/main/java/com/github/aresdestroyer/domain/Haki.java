package com.github.aresdestroyer.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Haki {

    @Id
    @GeneratedValue(generator = "sequenceHaki", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequenceHaki", allocationSize = 1)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "hakis")
    private List<Person> persons;
}
