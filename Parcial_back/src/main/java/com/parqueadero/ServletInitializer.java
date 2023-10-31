package com.parqueadero;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	protected Class<?>[] getRootConfigClasses() {  
        // TODO Auto-generated method stub  
        return null;  
    }  
  
    protected Class<?>[] getServletConfigClasses() {  
        return new Class[] { ParcialBackApplication.class };  
    }  
  
    protected String[] getServletMappings() {  
        return new String[] { "/" };  
    }  
  
      
}  