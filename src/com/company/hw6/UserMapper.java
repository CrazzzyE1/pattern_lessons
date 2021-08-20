package com.company.hw6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {
    private final Connection connection;

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    public User findById(Long id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
        statement.setLong(1, id);
        ResultSet result = statement.executeQuery();
        result.next();
        return new User(result.getLong(1), result.getString(2),
                result.getString(3), result.getBoolean(4));
    }
}
