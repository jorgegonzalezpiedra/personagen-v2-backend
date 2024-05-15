package com.personagen.auth;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.Authentication;

public class AuthenticationService{

    private static final String AUTH_TOKEN_HEADER_NAME = "api-key";
    private static final String AUTH_TOKEN = "PersonagenReact";

    public static Authentication getAuthentication(HttpServletRequest request) throws Exception {
        String apiKey = request.getHeader(AUTH_TOKEN_HEADER_NAME);

        //TODO implements DB validation based
        if (apiKey == null || !apiKey.equals(AUTH_TOKEN)) {
            throw new Exception("El parámetro api-key indicado en la cabecera no contiene una clave válida");
        }

        return new ApiKeyAuthentication(apiKey, AuthorityUtils.NO_AUTHORITIES);
    }
}
