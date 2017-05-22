package com.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.security.domain.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

	Item findById(long id);

}
