package com.demo.Util;

import com.demo.Entity.Blog;
import com.demo.Entity.State;
import org.apache.ibatis.type.*;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//@MappedJdbcTypes({JdbcType.INTEGER})
//@MappedTypes({State.class})
public class StateHandler extends BaseTypeHandler<State> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, State state, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public State getNullableResult(ResultSet resultSet, String column) throws SQLException {
        return State.intToEnum(resultSet.getInt(column));
    }

    @Override
    public State getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public State getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }

}
