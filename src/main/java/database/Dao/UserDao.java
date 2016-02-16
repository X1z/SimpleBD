package database.Dao;

import database.connection.DBWork;
import database.entity.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by X1z on 16.02.2016.
 */
public class UserDao {
    private final String QUERY_INSERT_USER="insert into users values (?,?,?,?)";
    private final String QUERY_DELETE_USER_BY_ID="delete from users where id=?";
    private final String QUERY_DELETE_USER_BY_NAME="delete from users where name=?";
    private final String QUERY_UPDATE_USER_BY_ID="update users set name=?, age =?, tel=? where id=?";

    public UserDao() {
    }

    public void insertUser(User user){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_INSERT_USER);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,user.getName());
            preparedStatement.setInt(3,user.getAge());
            preparedStatement.setString(4,user.getTel());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUserById(int userId){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_DELETE_USER_BY_ID);
            preparedStatement.setInt(1,userId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUserByName(String userName){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_DELETE_USER_BY_NAME);
            preparedStatement.setString(1, userName);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUserById(int userId, String newUserName, int newUserAge, String newUserTel){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_UPDATE_USER_BY_ID);
            preparedStatement.setString(1,newUserName);
            preparedStatement.setInt(2, newUserAge);
            preparedStatement.setString(3, newUserTel);
            preparedStatement.setInt(4, userId);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
