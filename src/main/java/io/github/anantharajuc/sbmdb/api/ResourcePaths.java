package io.github.anantharajuc.sbmdb.api;

public class ResourcePaths 
{
	public static final String API         			= "api";
	
	public static final String V1          			= "/v1";       
	
	public static final String ID          			= "/{id}";
	public static final String NAME        			= "/name";
	public static final String NAME_NATIVE_QUERY    = "/name-native-query";
	public static final String DEPARTMENT  			= "/department";
	
	public static final String PAGINATION  			= "/pagination";
	public static final String SORTING     			= "/sorting";
	
	public static final String ROOT_API    			= "/" + API;             
    public static final String ROOT_API_V1 			= ROOT_API + V1;   
    
    public class Student
    {
    	public static final String NAME    			= "/student";
    	
    	public final class V1
    	{
    		private V1() {}
    		
    		public static final String ROOT 		= ROOT_API_V1 + NAME;            
    	}
    }
}

