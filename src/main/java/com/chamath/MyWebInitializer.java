package com.chamath;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {DispatcherConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
