package com.personagen.utils;

import com.personagen.constants.PersonagenConstants;

import java.text.Normalizer;

public class ProfileDataBuilder {

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
     * @param name {@link String}
     * @param lastName1 {@link String} in case of a user profile
     * @return String
     */
    public static String buildEmailAddress(String name, String lastName1) {
        StringBuilder sbEmail = new StringBuilder();

        String randomSeparator = PersonagenConstants.SEPARATOR_CHARS[(int) (Math.random() * PersonagenConstants.SEPARATOR_CHARS.length)];
        String randomEmailDomain = PersonagenConstants.EMAIL_DOMAINS[(int) (Math.random() * PersonagenConstants.EMAIL_DOMAINS.length)];

        sbEmail.append(name);
        if(!lastName1.isEmpty()) sbEmail.append(randomSeparator).append(lastName1);
        sbEmail.append(randomEmailDomain);

        return Normalizer.normalize(sbEmail.toString(), Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .replace(" ", "")
                .toLowerCase();
    }

}
