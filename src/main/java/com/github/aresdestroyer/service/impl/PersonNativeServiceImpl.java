package com.github.aresdestroyer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.aresdestroyer.domain.Person;
import com.github.aresdestroyer.model.PersonDto;
import com.github.aresdestroyer.model.PersonNameAndBandDto2;
import com.github.aresdestroyer.repository.PersonRepository;
import com.github.aresdestroyer.service.PersonNativeService;

public class PersonNativeServiceImpl implements PersonNativeService {

    @Autowired
    private PersonRepository personRep;

    @Override
    public List<Person> findPersonLNative() {
	return personRep.findPersonL();
    }

    @Override
    public List<PersonDto> findPeopleDto() {
	return personRep.findPeopleDto();
    }

    @Override
    public List<PersonNameAndBandDto2> findNameAndBandName() {
	return personRep.findPersonNameAndBand();
    }
}
