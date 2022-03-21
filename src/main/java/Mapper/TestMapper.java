package Mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import project_se.Test;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TestMapper implements RowMapper<Test> {

    @Override
    public Test mapRow(ResultSet rs, int i) throws SQLException {
        Test test = new Test();
        test.setTest_id(rs.getLong("test_id"));
        test.setEndAt(rs.getTimestamp("duration").toLocalDateTime());
        test.setStartAt(rs.getTimestamp("startAt").toLocalDateTime());
        test.setTitle(rs.getString("title"));
        return test;
    }
}
