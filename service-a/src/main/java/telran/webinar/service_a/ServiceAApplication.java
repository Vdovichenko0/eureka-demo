package telran.webinar.service_a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class ServiceAApplication {

	@Autowired
	private ServiceBClient serviceBClient;

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

	@GetMapping("/fetch-data")
	public String fetchDataFromServiceB() {
		return serviceBClient.getDataFromServiceB();
	}

	@FeignClient("service-b")
	interface ServiceBClient {
		@GetMapping("/data")
		String getDataFromServiceB();
	}

}
 