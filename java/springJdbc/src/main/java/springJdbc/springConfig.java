package springJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = { "springJdbc","springJdbc.data","springJdbc.dao"})
public class springConfig {

	@Bean
	public JdbcTemplate getTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

	@Bean
	public DataSource getDataSource() {

		String url = "jdbc:mysql://localhost:3306/Boot_Camp";
		String user = "root";
		String password = "Bhargav@1108";
		String driverClassName = "com.mysql.cj.jdbc.Driver";

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);

		return dataSource;
	}

}
