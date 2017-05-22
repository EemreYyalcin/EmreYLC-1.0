package com.security.service;

import com.security.domain.Item;

public interface ItemService {

	void addItem(Item item);

	Iterable<Item> getItems();

	void deleteItemsById(long id);

	Item getItemById(long id);
}
