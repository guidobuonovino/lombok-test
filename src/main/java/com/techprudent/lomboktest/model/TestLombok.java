package com.techprudent.lomboktest.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLombok {

	private WithLombok wl;
	private WithoutLombok wol;

	public TestLombok() {
		super();
	}

	@Autowired
	public TestLombok(WithLombok wl, WithoutLombok wol) {
		super();
		this.wl = wl;
		this.wol = wol;
	}

	@PostConstruct
	private void testLombokClasses() {

		log.info("\n======================WITH LOMBOK======================== \n");

		log.info("name: " + wl.name());
		log.info("age: " + wl.age());
		log.info("address: " + wl.address());
		log.info("email: " + wl.email());

		log.info("\n======================WITHOUT LOMBOK======================== \n");

		log.info("name: " + wol.getName());
		log.info("age: " + wol.getAge());
		log.info("address: " + wol.getAddress());
		log.info("email: " + wol.getEmail());
	}

}
