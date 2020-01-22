package com.hibernate.demo2.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;



@Configuration
public class DataSourceBean {
	
Logger logger = Logger.getLogger(DataSourceBean.class);	
	
	@Value("${spring.datasource.url}")
	private String Url;
	
//	@Value("${spring.datasource.driver}")
//	private String Driver;
	
	@Value("${spring.datasource.username}")
	private String Username;
	
	@Value("${spring.datasource.password}")
	private String Password;
	
//	@Bean
//	@Qualifier("datasource")
//	public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(Driver);
//        dataSource.setUrl(Url);
//        dataSource.setUsername(Username);
//        dataSource.setPassword(Password);
//        return dataSource;
//    }
	
    
//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        
//        	dataSourceBuilder.url(Url);
//            dataSourceBuilder.driverClassName(Driver);
//            dataSourceBuilder.username(Username);
//            dataSourceBuilder.password(Password);
//        
//        
//        return dataSourceBuilder.build();
//    }
}