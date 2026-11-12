package com.wridea.backend.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/system")
public class SystemController {

	@GetMapping("/ping")
	public PingResponse ping() {
		return new PingResponse("ok", "wridea-be");
	}

	public record PingResponse(String status, String service) {
	}
}
