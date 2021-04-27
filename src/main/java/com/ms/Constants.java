package com.ms;

public class Constants {
    
	// Spring Security

	public static final String LOGIN_URL = "/login";
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";

	// JWT

	public static final String ISSUER_INFO = "https://sprint-boot-api-postgres.herokuapp.com/";
	public static final String SUPER_SECRET_KEY = "1rH7II0943vYK1ZgjDYEJSxEZcE9L7fB_Cx96AEBH4";
	public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day

}