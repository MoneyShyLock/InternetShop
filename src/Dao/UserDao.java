package Dao;

import java.util.List;

import bean.User;

public interface UserDao {

	User login(String name, String pwd);

	List<User> findAll();

	User findById(int id);


	int modify(String pwd, int id);

	int delete(int id);

}
