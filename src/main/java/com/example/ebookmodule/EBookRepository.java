package com.example.ebookmodule;

import org.springframework.data.repository.CrudRepository;

import com.example.ebookmodule.EBook;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EBookRepository extends CrudRepository<EBook, Integer> {

}