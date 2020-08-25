package de.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@GetMapping("test") // This endpoint should be ignored
	public String test() {
		return "1.0";
	}

	@GetMapping("foo")
	public String test1() {
		return "foo";
	}

}
