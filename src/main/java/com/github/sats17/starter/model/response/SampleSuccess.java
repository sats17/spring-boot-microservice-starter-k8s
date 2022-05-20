package com.github.sats17.starter.model.response;

/**
 * Sample response body class, you can create your own body.
 * @author sats17
 *
 */
public class SampleSuccess {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SampleSuccess [message=" + message + "]";
	}

}
