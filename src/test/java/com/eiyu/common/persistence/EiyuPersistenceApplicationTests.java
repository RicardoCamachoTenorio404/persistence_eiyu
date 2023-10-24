package com.eiyu.common.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.eiyu.common.persistence.repository.azul.AccessRepository;


@SpringBootTest
class EiyuPersistenceApplicationTests {

	@Autowired
	AccessRepository accessRepository;

	@Test
	void contextLoads() {
		Assert.notEmpty(accessRepository.findAll(), " OK ");
	}

}
