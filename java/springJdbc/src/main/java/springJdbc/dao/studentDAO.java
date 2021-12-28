package springJdbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import springJdbc.data.Student;

@Component
public class studentDAO {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public void insert(Student student) {
		 
		String insertSql="INSERT INTO student VALUES(?,?,?)";
		
		jdbcTemplate.update(insertSql,student.getRollno(),student.getName(),student.getMobile());
		
		System.out.println("Inserted Succesfully");
		
		
	}
	
	public void update(Student student) {
		 
		String insertSql="UPDATE student SET name=?,mobile=? WHERE rollno=?";
		
		jdbcTemplate.update(insertSql,student.getName(),student.getMobile(),student.getRollno());
		
		System.out.println("Updated Succesfully");
		
		
	}
	public void delete(int rollno) {
		 
		String insertSql="DELETE FORM student WHERE rollno=?";
		
		jdbcTemplate.update(insertSql,rollno);
		
		System.out.println("Deleted Succesfully");
		
		
	}
	public Student get(int rollno) {
		 
		String getSql="SELECT * FROM  student WHERE rollno=?";
		Student student = (Student)jdbcTemplate.queryForObject(getSql,new Object[] {rollno},new BeanPropertyRowMapper(Student.class));
		System.out.println(student.toString());
		return student;
		
		
	}
	public List<Student> getAll() {
		
		String getall="SELECT * FROM student";
		
		List<Student> student=(List<Student>) jdbcTemplate.query(getall,new BeanPropertyRowMapper(Student.class));
		 
		System.out.println(student.toString());
		return student;
		
		
	}
	
	
	
	
}
