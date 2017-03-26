package br.com.jpb.sbwsm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/rest")
@Slf4j
public class RestController {

	@RequestMapping(value = "/test")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("OK");
	}

}
