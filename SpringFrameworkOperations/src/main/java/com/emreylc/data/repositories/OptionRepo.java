package com.emreylc.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emreylc.data.entities.Option;

@Repository
public interface OptionRepo extends JpaRepository<Option, Long> {

}
