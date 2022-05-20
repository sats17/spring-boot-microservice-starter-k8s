package com.github.sats17.starter.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status {

	private Integer rootCode;
	private String rootType;
	private List<Error> error;

	public Integer getRootCode() {
		return rootCode;
	}

	public void setRootCode(Integer rootCode) {
		this.rootCode = rootCode;
	}

	public String getRootType() {
		return rootType;
	}

	public void setRootType(String string) {
		this.rootType = string;
	}

	public List<Error> getError() {
		return error;
	}

	public void setError(List<Error> error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "Status [rootCode=" + rootCode + ", rootType=" + rootType + ", error=" + error + "]";
	}

}
