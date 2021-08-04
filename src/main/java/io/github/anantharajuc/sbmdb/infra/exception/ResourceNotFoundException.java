package io.github.anantharajuc.sbmdb.infra.exception;

/**
 * Resource Not Found Exception
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
public class ResourceNotFoundException extends RuntimeException 
{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) 
    {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    }
}
