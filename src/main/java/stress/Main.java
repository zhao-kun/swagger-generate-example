package stress;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}



	@GetMapping("/stress/sleep50")
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
	public String sleep100() {
		this.sleep(100);
		return "Sleep 100";
	}

	@GetMapping("/stress/sleep200")
	public String sleep200() {
		this.sleep(200);
		return "Sleep 200";
	}

	@GetMapping("sayHello/{one}")
	@ApiResponse(code = 400,message = "parameter error")
	public ResponseEntity<Hello> sayHello(@PathVariable("one") @RequestParam("hello") String one) {
		return ResponseEntity.ok(new Hello());
	}

}

