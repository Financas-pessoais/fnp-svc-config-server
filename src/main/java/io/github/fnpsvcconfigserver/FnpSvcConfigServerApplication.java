package io.github.fnpsvcconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FnpSvcConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnpSvcConfigServerApplication.class, args);
	}

}
