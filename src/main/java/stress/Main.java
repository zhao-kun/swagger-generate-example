package stress;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@SpringBootApplication
@Api("/", description="Stress test controller")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}



	@GetMapping("/stress/sleep50")
	@ApiOperation("Sleep 50 millseconds and return a string")
	public String sleep50() {
		this.sleep(50);
		return "Sleep 50";
	}

	public void sleep(long millsconds) {
		try {
			Thread.sleep(millsconds	);
		}
		catch (Exception e) {

		}
	}

	@GetMapping("/stress/sleep100")
	@ApiOperation("Sleep 100 millseconds and return a string")
	public String sleep100() {
		this.sleep(100);
		return "Sleep 100";
	}

	@GetMapping("/stress/sleep200")
	@ApiOperation("Sleep 200 millseconds and return a string")
	public String sleep200() {
		this.sleep(200);
		return "Sleep 200";
	}

}

