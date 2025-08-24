package com.art.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.art.model.Art;

@Repository
public interface ArtRepository extends MongoRepository<Art, String> {

}
