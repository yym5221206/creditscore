package com.runrong.creditscore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import com.runrong.creditscore.config.DbConfig;
import com.runrong.creditscore.config.RuleConfig;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableScheduling
public class CreditScoreApp {
	
	private static Logger logger = LoggerFactory.getLogger(CreditScoreApp.class);

    public static void main(String[] args) throws Exception {
        DbConfig.init();
        RuleConfig.init();
        logger.info("Config加载完毕~");
        SpringApplication.run(CreditScoreApp.class, args);
    }
    
}
