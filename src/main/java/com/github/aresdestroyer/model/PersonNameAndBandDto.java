package com.github.aresdestroyer.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class PersonNameAndBandDto {

    private String name;
    private Long reward;

}
