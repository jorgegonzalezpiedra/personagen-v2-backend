package com.personagen.utils;

import com.personagen.constants.PersonagenConstants;

import java.util.Arrays;

public class UserDataBuilder {

    /**
     * Build a username using random separators and the first and last names
     * @param firstName {@link String}
     * @param lastName1 {@link String}
     * @param lastName2 {@link String}
     * @return String
     */
    public static String buildUserName(String firstName, String lastName1, String lastName2) {
        String randomSeparator = PersonagenConstants.SEPARATOR_CHARS[(int) (Math.random() * PersonagenConstants.SEPARATOR_CHARS.length)];
        String randomSeparator2 = PersonagenConstants.SEPARATOR_CHARS[(int) (Math.random() * PersonagenConstants.SEPARATOR_CHARS.length)];
        return (firstName + randomSeparator + lastName1 + randomSeparator2 + lastName2).replace(" ", "").trim().toLowerCase();
    }

    /**
     * Builds an email address using random separators and random domain name
     * @param firstName {@link String}
     * @param lastName1 {@link String}
     * @return String
     */
    public static String buildEmailAddress(String firstName, String lastName1) {
        String randomSeparator = PersonagenConstants.SEPARATOR_CHARS[(int) (Math.random() * PersonagenConstants.SEPARATOR_CHARS.length)];
        String randomEmailDomain = PersonagenConstants.EMAIL_DOMAINS[(int) (Math.random() * PersonagenConstants.EMAIL_DOMAINS.length)];
        return (firstName + randomSeparator + lastName1 + randomEmailDomain).replace(" ", "").trim().toLowerCase();
    }

}
