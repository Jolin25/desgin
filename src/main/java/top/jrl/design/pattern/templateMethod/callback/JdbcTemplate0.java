package top.jrl.design.pattern.templateMethod.callback;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A0：0为结尾命名代表学习A
 *
 * @author jrl
 * @date Create in 16:12 2022/10/9
 */
public class JdbcTemplate0 {
    public static void main(String[] args) {
        new JdbcTemplate0().queryString();
    }

    void queryString() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.query("sql", new UserRowMapper());
    }
    // 这个是包含了 callback 的对对象
    class UserRowMapper implements RowMapper<String> {

        @Override
        public String mapRow(ResultSet rs, int rowNum) throws SQLException {

            return "aa" + Math.random();
        }
    }
}
