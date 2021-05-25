package com.app.dca.DevApplication.exception;

public class UnknownDeveloperException extends Exception {
	int devId;

	public UnknownDeveloperException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public UnknownDeveloperException(int devId) {
		super();
		this.devId = devId;
	}

	
}
