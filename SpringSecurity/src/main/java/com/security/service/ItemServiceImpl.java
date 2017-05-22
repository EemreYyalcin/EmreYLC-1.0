package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.domain.Item;
import com.security.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	private final ItemRepository itemRepository;

	@Autowired
	public ItemServiceImpl(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public void addItem(Item item) {
		itemRepository.save(item);
	}

	@Override
	public Iterable<Item> getItems() {
		return itemRepository.findAll();
	}

	@Override
	public void deleteItemsById(long id) {
		itemRepository.delete(id);
	}

	@Override
	public Item getItemById(long id) {
		return itemRepository.findById(id);
	}

}
