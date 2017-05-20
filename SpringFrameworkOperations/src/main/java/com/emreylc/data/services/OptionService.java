package com.emreylc.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emreylc.data.repositories.OptionRepo;

@Service
public class OptionService {

	@Autowired
	private OptionRepo optionRepo;

	public OptionRepo getOptionRepo() {
		return optionRepo;
	}

	public void setOptionRepo(OptionRepo optionRepo) {
		this.optionRepo = optionRepo;
	}
}
