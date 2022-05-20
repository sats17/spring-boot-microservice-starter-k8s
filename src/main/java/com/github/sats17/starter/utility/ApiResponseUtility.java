package com.github.sats17.starter.utility;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.github.sats17.starter.model.response.FinalResponse;
import com.github.sats17.starter.model.response.SampleSuccess;
import com.github.sats17.starter.model.response.Status;

public class ApiResponseUtility {

	public static ResponseEntity<FinalResponse<SampleSuccess>> successResponseCreator(SampleSuccess body, String message) {
		Status status = new Status();
		status.setRootCode(20000);
		status.setRootType("Success");
	
		FinalResponse<SampleSuccess> finalResponse = new FinalResponse<>();
		finalResponse.setStatus(status);
		finalResponse.setResponse(body);
		ResponseEntity<FinalResponse<SampleSuccess>> successResponse = new ResponseEntity<>(
				   finalResponse, HttpStatus.OK);
		return successResponse;
	}

	public static ResponseEntity<FinalResponse<List<SampleSuccess>>> successResponseCreator(List<SampleSuccess> test,
			String message) {
		Status status = new Status();
		status.setRootCode(20000);
		status.setRootType("Success");
	
		FinalResponse<List<SampleSuccess>> finalResponse = new FinalResponse<>();
		finalResponse.setStatus(status);
		finalResponse.setResponse(test);
		ResponseEntity<FinalResponse<List<SampleSuccess>>> successResponse = new ResponseEntity<>(
				   finalResponse, HttpStatus.OK);
		return successResponse;
	}
	
}
