package com.github.sats17.starter.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * Final response class, which generalized for error and success response.
 * 
 * Success Response Example :
 * {
 * 		"status": {
 * 			"rootCode": 20000,
 * 			"rootType": "success",
 * 			"service": "application_name"
 * 		},
 * 		"response": {
 * 			"responseMessage": "This is your customized response body"
 * 		}
 * }
 * 
 * Error Response Example :
 * {
 * 		"status": {
 * 			"rootCode": 240000,
 * 			"rootType": "RequestValidationException",
 * 			"service": "application_name"
 * 			"error": {
 * 				"resultCode": 40001,
 * 				"resultType": "HeaderValidationException",
 * 				"message": "API-Key missing",
 * 				"httpMethod": "GET",
 * 				"httpRequestURI": "/api/register"
 * 			}
 * 		}
 * }
 * 
 * @author sats17
 *
 * @param <E>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinalResponse<E> {

	private Status status;
	private E response;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public E getResponse() {
		return response;
	}

	public void setResponse(E response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "FinalResponse [status=" + status + ", response=" + response + "]";
	}

}
