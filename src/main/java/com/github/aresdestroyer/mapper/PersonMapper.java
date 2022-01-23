package com.github.aresdestroyer.mapper;

import org.mapstruct.Mapper;

import com.github.aresdestroyer.domain.Person;
import com.github.aresdestroyer.model.PersonNameAndBandDto;

@Mapper
public interface PersonMapper {

    PersonNameAndBandDto map(Person person);
}
