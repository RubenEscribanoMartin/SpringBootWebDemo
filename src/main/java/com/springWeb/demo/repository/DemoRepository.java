package com.springWeb.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springWeb.demo.data.DemoMapper;

/**
 * This class gives you the 'welcome message' having two methods, one for get the
 * language by user and other for get the message by language
 * @author ruben
 *
 */
@Repository
public class DemoRepository {

	
	@Autowired
    private DemoMapper demoMapper;
 
    public DemoRepository(DemoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }
 
    public String getMessageByUser(String userName) {
        String language = demoMapper.getLanguageByUser(userName);
 
        return demoMapper.getMessageByLanguage(language);
    }
}
