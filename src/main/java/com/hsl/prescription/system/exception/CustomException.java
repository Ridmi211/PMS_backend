package com.hsl.prescription.system.exception;

public class CustomException {
    private StatusCode statusCode;
    private String message;


}

enum StatusCode{
    S2000,
    E4001,
    E4003
}
