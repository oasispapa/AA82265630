package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@GetMapping
	public String getUserFromPathString(@PathVariable String userId) {
		return "82265630";
	}


	// 도메인에서 사번을 추출하는 GET API
	// @GetMapping
	// public String getUserFromDomain(HttpServletRequest request) {
	// 	// 요청된 호스트네임 가져오기
	// 	String host = request.getServerName();
	//
	// 	// 정규식을 사용해 'sampleapp1-[사번]' 패턴에서 사번 추출
	// 	String empId = extractEmpIdFromHost(host);
	//
	// 	if (empId != null) {
	// 		return empId;
	// 	} else {
	// 		return "Invalid domain format";
	// 	}
	// }
	//
	// // 정규식을 통해 호스트명에서 사번을 추출하는 함수
	// private String extractEmpIdFromHost(String host) {
	// 	// 예: sampleapp1-12345.cepg-aa.kubepia.net
	// 	String regex = "sampleapp1-(\\d+)\\.ce-aa\\.kubepia\\.net";
	// 	java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
	// 	java.util.regex.Matcher matcher = pattern.matcher(host);
	//
	// 	if (matcher.find()) {
	// 		// 첫 번째 그룹이 사번에 해당
	// 		return matcher.group(1);
	// 	} else {
	// 		return null;
	// 	}
	// }
}
