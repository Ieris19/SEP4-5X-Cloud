package dk.via.sep4.cloud;


import dk.via.sep4.cloud.lorawan.C;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
		SpringApplication.run(C.class,args);
	}
}
