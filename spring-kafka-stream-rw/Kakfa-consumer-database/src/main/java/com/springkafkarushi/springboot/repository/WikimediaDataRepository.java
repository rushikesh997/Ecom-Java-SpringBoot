package com.springkafkarushi.springboot.repository;

import com.springkafkarushi.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {


}
