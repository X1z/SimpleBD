package database.Dao;

import database.connection.DBWork;
import database.entity.Book;
import database.entity.User;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by X1z on 16.02.2016.
 */
public class LibraryActionDao {
    private final String QUERY_USER_TAKE_BOOK="insert into lib_action values (?,?,?,?)";
    private final String QUERY_USER_RETURN_BOOK="delete from lib_action where user_id=? , book_id=?";

    public LibraryActionDao() {
    }

    public void userTakeBook(int idOperation, User user, Book book){
        try {
            java.util.Date date = new java.util.Date();
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_USER_TAKE_BOOK);
            preparedStatement.setInt(1,idOperation);
            preparedStatement.setInt(2, user.getId());
            preparedStatement.setInt(3,book.getId());
            preparedStatement.setDate(4,new Date(date.getYear(),date.getMonth(),date.getDay()));
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void userReturnBook(User user, Book book){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_USER_RETURN_BOOK);
            preparedStatement.setInt(1,user.getId());
            preparedStatement.setInt(2, book.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
