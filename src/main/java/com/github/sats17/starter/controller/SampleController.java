package com.github.sats17.starter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sats17.starter.model.response.FinalResponse;
import com.github.sats17.starter.model.response.SampleSuccess;
import com.github.sats17.starter.utility.ApiResponseUtility;
import com.github.sats17.starter.model.response.Error;

@RestController
@RequestMapping("/api")
public class SampleController {
	
	/*
	 * Shows how you can create success response of any list
	 */
	@GetMapping("/success")
	public ResponseEntity<FinalResponse<List<SampleSuccess>>> testSuccess() {
		List<SampleSuccess> test = new ArrayList<>();
		SampleSuccess successBody = new SampleSuccess();
		successBody.setMessage("Hi I am from success Message");
		test.add(successBody);
		return ApiResponseUtility.successResponseCreator(test, "tes");
	}
	
	/*
	 * Shows how you can create success response of any list
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/error")
	public ResponseEntity<FinalResponse> testError() {
		List<Error> errors = new ArrayList<>();
		Error error = new Error();
		error.setResultCode(40001);
		error.setResultType("HeaderValidatoinException");
		error.setHttpRequestURI("/api/error");
		error.setMessage("Please enter correct API key");
		error.setHttpMethod("GET");
		errors.add(error);
		return ApiResponseUtility.validationErrorResponseCreator(errors, "message");
				
	}

}
