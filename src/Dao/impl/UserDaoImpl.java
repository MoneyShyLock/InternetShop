package Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.UserDao;
import JDBCUtil.MyJdbcUtil;
import bean.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User login(String name, String pwd) {
		Connection conn = MyJdbcUtil.getConnetion();
		String sql = "select * from  user where uname=? and upassword =?";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		User u = null;
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, name);
			pstat.setString(2, pwd);
			rs = pstat.executeQuery();
			if (rs.next()) {
				u = new User();
				u.setUid(rs.getInt("uid"));
				u.setUname(rs.getString("uname"));
				u.setUpassword(rs.getString("upassword"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public List<User> findAll() {
		Connection conn = MyJdbcUtil.getConnetion();
		List<User> list = new ArrayList<>();
		String sql = "select * from  user ";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		User u = null;
		try {
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setUid(rs.getInt("uid"));
				u.setUname(rs.getString("uname"));
				u.setUpassword(rs.getString("upassword"));
				list.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public User findById(int id) {
		Connection conn = MyJdbcUtil.getConnetion();
		String sql = "select * from  user where uid=? ";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		User u = null;
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, id);
			rs = pstat.executeQuery();
			if (rs.next()) {
				u = new User();
				u.setUid(rs.getInt("uid"));
				u.setUname(rs.getString("uname"));
				u.setUpassword(rs.getString("upassword"));
				u.setUage(rs.getInt("uage"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public int modify(String pwd, int id) {
		Connection conn = MyJdbcUtil.getConnetion();
		
		String sql = "update user set upassword=? where uid = ?;";
		PreparedStatement pstate=null;
		int count=0;
		try {
			pstate = conn.prepareStatement(sql);
			pstate.setString(1, pwd);
			pstate.setInt(2, id);
			count = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int delete(int id) {
		Connection conn = MyJdbcUtil.getConnetion();
		String sql = "delete  from  user where uid=?";
		PreparedStatement pstat = null;
		int count = 0;
		try {
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, id);
			count = pstat.executeUpdate();
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
