package com.marvel.register.service.person;

import com.marvel.register.document.person.PersonDocument;
import com.marvel.register.document.person.PersonRepository;
import com.marvel.register.rest.person.dto.PersonDTO;
import com.marvel.register.service.person.converter.PersonDTOConverter;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepository repository;
    private final PersonDTOConverter converter;

    public PersonService(final PersonRepository repository, final PersonDTOConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public void save(final PersonDTO dto) {
        final PersonDocument document = converter.convertToDocument(dto);
        if (document == null) {
            return;
        }

        repository.save(document);
    }
}
