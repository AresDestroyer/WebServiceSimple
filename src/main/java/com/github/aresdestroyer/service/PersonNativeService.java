package com.github.aresdestroyer.service;

import java.util.List;

import com.github.aresdestroyer.domain.Person;
import com.github.aresdestroyer.model.PersonDto;
import com.github.aresdestroyer.model.PersonNameAndBandDto2;

public interface PersonNativeService {

    List<PersonDto> findPeopleDto();

    List<Person> findPersonLNative();

    List<PersonNameAndBandDto2> findNameAndBandName();

}
