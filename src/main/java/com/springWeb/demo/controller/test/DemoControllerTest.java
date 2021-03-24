package com.springWeb.demo.controller.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.springWeb.demo.controller.DemoController;
import com.springWeb.demo.service.DemoService;

/**
 * Test Controller class
 * 
 * @author ruben
 *
 */
public class DemoControllerTest {

	private DemoController demoController;
	private DemoService demoService;
	
	@Before
	public void init() {
		demoService = mock(DemoService.class);//-mocked service class
		demoController = new DemoController(demoService);
	}
	
	@Test
	public void demoControllerShouldCallService() {
        String userName = "ruffen";
        String expectedMessage = "message";
 
        when(demoService.welcome(userName)).thenReturn(expectedMessage);
 
        String message = demoController.welcome(userName);
 
        verify(demoService).welcome(userName);
        assertTrue(message.equals(expectedMessage));    
    }

}
