package Service.impl;

import java.util.List;

import Dao.UserDao;
import Dao.impl.UserDaoImpl;
import Service.UserService;
import bean.User;

public class UserServiceImpl implements UserService {
	UserDao userDao=new UserDaoImpl();
	@Override
	public User login(String name, String pwd) {
		
		return userDao.login(name,pwd);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public User findById(int id) {
		
		return userDao.findById(id);
	}

	@Override
	public int modify(String pwd, int id) {
		// TODO Auto-generated method stub
		return userDao.modify(pwd,id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

}
