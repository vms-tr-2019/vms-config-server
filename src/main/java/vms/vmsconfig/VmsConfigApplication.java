package vms.vmsconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VmsConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmsConfigApplication.class, args);
	}

}

