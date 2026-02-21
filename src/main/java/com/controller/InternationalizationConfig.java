package com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class InternationalizationConfig implements WebMvcConfigurer {

	// Create a SessionLocaleResolver object and set the default locale to
	// English return the SessionLocaleResolver object

	@Bean
	public LocaleResolver localeResolver() {

		// Fill the code
		org.springframework.web.servlet.i18n.SessionLocaleResolver slr = new org.springframework.web.servlet.i18n.SessionLocaleResolver();
		slr.setDefaultLocale(java.util.Locale.ENGLISH);
		return slr;
	}

	// Create LocaleChangeInterceptor object and set the parameter name as
	// language and return the localeChangeInterceptor
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		// Fill the code
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("language");
		return lci;

	}

	// register the LocaleChangeInterceptor
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// Fill the code
		registry.addInterceptor(localeChangeInterceptor());
	}
}
