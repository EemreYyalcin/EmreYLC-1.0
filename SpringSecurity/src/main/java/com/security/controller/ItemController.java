package com.security.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.security.domain.Item;
import com.security.service.ItemService;
import com.security.service.UserService;

@Controller
public class ItemController {

	private final ItemService itemService;
	private final UserService userService;

	public ItemController(ItemService itemService, UserService userService) {
		this.itemService = itemService;
		this.userService = userService;
	}

	@RequestMapping("/items/add")
	public ModelAndView itemAddPage() {
		return new ModelAndView("addItem", "itemForm", new Item());
	}

	@RequestMapping(value = "/items", method = RequestMethod.POST)
	public String handleItemAdd(@Valid @ModelAttribute("itemForm") Item item, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "addItem";
		}
		itemService.addItem(item);
		return "redirect:/items";
	}

	@RequestMapping(value = "/items/{id}", method = RequestMethod.DELETE)
	public String handleItemDelete(@PathVariable Long id) {
		itemService.deleteItemsById(id);
		return "redirect:/items";
	}

	@RequestMapping("/items")
	public ModelAndView getItemsPage() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("items", itemService.getItems());
		model.put("usernames", userService.getUsernames());
		return new ModelAndView("items", model);
	}

}