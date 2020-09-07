package com.github.sonarapp;

/**
 * Hello world!
 *
 */
public class App 
{
	
	String data = "not used variable";
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public void sampleMethod() {
    	System.out.println("Starting");
    	int i=2;
    	if(i ==2) {
    		System.out.println("working");
    	}else if(i==2) {
    		System.out.println("not working");
    	}
    }
    
    public void sampleMethod2() {
    	System.out.println("Starting");
    	System.out.println("stop");
    }
}
