package fun.mytoys.liquibase.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LiquibaseConfig {
//    @Bean
//    public SpringLiquibase liquibase(DataSource dataSource, LiquibaseProperties liquibaseProperties) {
//
//        SpringLiquibase liquibase = new SpringLiquibase(taskExecutor, env);
//        liquibase.setDataSource(dataSource);
//        //制定changelog的位置，这里使用的一个master文件引用其他文件的方式
//        liquibase.setChangeLog("classpath:config/liquibase/master.xml");
//        liquibase.setContexts(liquibaseProperties.getContexts());
//        liquibase.setDefaultSchema(liquibaseProperties.getDefaultSchema());
//        liquibase.setDropFirst(liquibaseProperties.isDropFirst());
//        return liquibase;
//    }
}
