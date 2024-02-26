package database;


import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {

    public ArrayList<User> selectAll() {

        ArrayList<User> listUser = new ArrayList<User>();


        try {
            Connection c = JDBCUtil.getConnection();
            String query = "SELECT * FROM user";
            PreparedStatement st = c.prepareStatement(query);

            System.out.println(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                String userID = rs.getString("userID");
                String email = rs.getString("email");
                String password = rs.getString("password");
                int yearOld = rs.getInt("yearold");
                String fullName = rs.getString("fullname");
                boolean gender = rs.getBoolean("gender");
                String phonenumber = rs.getString("phonenumber");
                String address = rs.getString("address");

                User user = new User(userID, email, password, yearOld, fullName, gender, phonenumber, address);

                listUser.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return listUser;
    }

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();
        ArrayList<User> userList = userDAO.selectAll();

        for (User user : userList) {
            System.out.println(user);
        }

    }
}
