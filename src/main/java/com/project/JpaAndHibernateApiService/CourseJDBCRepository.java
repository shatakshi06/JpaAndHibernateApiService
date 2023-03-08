package com.project.JpaAndHibernateApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String insert_query = 
        """
                insert into course(id,name,author)
                values(1,'Shatakshi','Kanishk');
        """;

    private static String insert_query_1 = 
        """
                insert into course(id,name,author)
                values(?,?,?);
        """;

    private static String delete_query = 
        """
                delete from course
                where id = ?;
        """;

    private static String select_query = 
        """
                select * from course
                where id = ?;
        """;

    public void insert() {

        springJdbcTemplate.update(insert_query);
    }

    public void insert2(Course course) {

        springJdbcTemplate.update(insert_query_1, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id) {

        springJdbcTemplate.update(delete_query, id);
    }

    public Course select(long id) {

        //Row Mapper helps to convert Result Set to a bean.
        return springJdbcTemplate.queryForObject(select_query, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
