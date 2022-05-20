package com.github.sats17.starter.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

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
