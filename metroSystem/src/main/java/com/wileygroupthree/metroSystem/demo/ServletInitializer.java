package com.wileygroupthree.metroSystem.demo;

import com.wileygroupthree.metroSystem.demo.MetroSystemApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MetroSystemApplication.class);
	}

}
