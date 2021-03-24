package com.springWeb.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.demo.repository.DemoRepository;

/**
 * This Service gives a welcome message
 * @author ruben
 *
 */
@Service
public class DemoService {
	/*
	 * with @Autowired we don't need to instantiate an object
	 */
	@Autowired
    private DemoRepository demoRepository;
 
	//constructor
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }
 
    public String welcome(String userName) {
        return demoRepository.getMessageByUser(userName);
    }

}
