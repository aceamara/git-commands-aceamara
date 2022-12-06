package amara.customerDetailService.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication (scanBasePackages = "amara.customerDetailService")
public class CustomerDetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDetailServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}

}
