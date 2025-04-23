package com.marvel.register.document.person;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<PersonDocument, String> {
}
