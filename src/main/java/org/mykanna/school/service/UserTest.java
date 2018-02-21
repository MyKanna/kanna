package org.mykanna.school.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mykanna.school.entity.UserWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserTest {
	@Autowired
	public UserService userService;
	
	@Test
	public void getUserByIdTest(){	     
        UserWithBLOBs user = userService.findUserById(1L);
        System.out.println("Test============OK:"+user.getName());
    }
}
