package com.personagen.auth;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AuthenticationFilter extends OncePerRequestFilter {

    List<String> listSwaggerEndopints = List.of("/swagger-ui/index.html", "/swagger-ui/swagger-ui.css", "/swagger-ui/swagger-ui-bundle.js",
            "/swagger-ui/swagger-ui-standalone-preset.js", "/swagger-ui/swagger-initializer.js",
            "/swagger-ui/favicon-32x32.png", "/swagger-ui/favicon-32x32.png",
            "/swagger-ui/favicon-16x16.png", "/swagger-ui.html", "/v3/api-docs/swagger-config", "/v3/api-docs");

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            Authentication authentication = AuthenticationService.getAuthentication(request);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception exp) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            PrintWriter writer = response.getWriter();
            writer.print(exp.getMessage());
            writer.flush();
            writer.close();
        }
        filterChain.doFilter(request, response);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request)
            throws ServletException {

        return listSwaggerEndopints.stream().anyMatch(endpoint -> endpoint.equals(request.getRequestURI()));

    }
}