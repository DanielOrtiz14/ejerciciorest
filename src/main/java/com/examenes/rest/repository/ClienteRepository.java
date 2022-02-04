package com.examenes.rest.repository;

import com.examenes.rest.schemas.ClienteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {}
