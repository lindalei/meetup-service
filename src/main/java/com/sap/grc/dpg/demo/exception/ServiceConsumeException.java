package com.sap.grc.dpg.demo.exception;

public class ServiceConsumeException extends Exception {
  public ServiceConsumeException(String message) {
    super(message);
  }

  public ServiceConsumeException(String message, Throwable cause) {
    super(message, cause);
  }
}
