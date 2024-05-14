package com.personagen.auth;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.Authentication;

public class AuthenticationService{

    private static final String AUTH_TOKEN_HEADER_NAME = "X-API-KEY";
    private static final String AUTH_TOKEN = "PersonagenReact";

    public static Authentication getAuthentication(HttpServletRequest request) throws Exception {
        String apiKey = request.getHeader(AUTH_TOKEN_HEADER_NAME);

        //TODO implements DB validation based
        if (apiKey == null || !apiKey.equals(AUTH_TOKEN)) {
            throw new Exception();
        }

        return new ApiKeyAuthentication(apiKey, AuthorityUtils.NO_AUTHORITIES);
    }
}
