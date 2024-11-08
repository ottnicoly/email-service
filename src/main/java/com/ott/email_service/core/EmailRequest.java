package com.ott.email_service.core;

public record EmailRequest(String to, String subject, String body) {

}
