package org.mykanna.school.service;

import org.mykanna.school.dao.UserDao;
import org.mykanna.school.entity.UserWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public UserWithBLOBs findUserById(Long id) {
		return userDao.selectByPrimaryKey(id);
		
	}

}
