package com.endava.framework.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WarningMessages {

    INVALID_LOGIN_PASSWORD("Invalid Email or Password"),
    INVALID_PASSWORD_OR_CONFIRM("The Password field is required."),
    INVALID_FIRST_NAME("The First name field is required."),
    INVALID_LAST_NAME("The Last Name field is required."),
    INVALID_EMAIL("The Email field is required."),
    INVALID_DATA_MAIL("The Email field must contain a valid email address."),
    INVALID_DATA_PASSWORD("The Password field must be at least 6 characters in length."),
    INVALID_MATCHING_OF_PASSWORD("Password not matching with confirm password."),
    INVALID_PHONE_NUMBER("The phone number must have valid format"),
    INVALID_MATCHING_LOCATION("No matches found"),
    INVALID_DATE("Invalid date");

    private String message;
}
