package database.Dao;

import database.connection.DBWork;
import database.entity.Book;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by X1z on 16.02.2016.
 */
public class BookDao {
    private final String QUERY_INSERT_BOOK="insert into books values (?,?,?,?)";
    private final String QUERY_DELETE_BOOK="delete from books where id=?";
    private final String QUERY_DELETE_BOOK_BY_NAME="delete from books where name=?";

    public BookDao() {
    }

    public void insertBook(Book book){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_INSERT_BOOK);
            preparedStatement.setInt(1,book.getId());
            preparedStatement.setString(2,book.getName());
            preparedStatement.setString(3, book.getAutor());
            preparedStatement.setInt(4,book.getCount());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBookById(int bookId){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_DELETE_BOOK);
            preparedStatement.setInt(1,bookId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBookByName(String bookName){
        try {
            DBWork dbWork = new DBWork();
            PreparedStatement preparedStatement = dbWork.getConnection().prepareStatement(QUERY_DELETE_BOOK_BY_NAME);
            preparedStatement.setString(1, bookName);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
