package com.github.aresdestroyer.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class DevilFruit {

    @Id
    @GeneratedValue(generator = "sequenceDevilFruit", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequenceDevilFruit", allocationSize = 1)
    private Long id;
    private String name;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_PERSON")
    private Person person;

}
