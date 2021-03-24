package ru.opentraders.cashback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CashbackApplication {
	static final Logger logger = LoggerFactory.getLogger(CashbackApplication.class);

	public static void main(String[] args) {
		logger.info("Before Starting application");
		SpringApplication.run(CashbackApplication.class, args);
	}

}
