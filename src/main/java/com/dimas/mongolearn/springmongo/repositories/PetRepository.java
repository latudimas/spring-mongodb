package com.dimas.mongolearn.springmongo.repositories;

import com.dimas.mongolearn.springmongo.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository<Pets, String> {
    Pets findBy_id(ObjectId _id);
}
