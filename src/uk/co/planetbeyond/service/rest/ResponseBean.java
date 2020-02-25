package uk.co.planetbeyond.service.rest;

/**
 * Response that will be sent for each HTTP request received on REST Server. Response code and descriptions are defiend in IVR Integeration Document
 * @author planetbeyond
 *
 */
public class ResponseBean 
{
	
	Integer responseCode;
	String description;
	
	public ResponseBean()
	{
		responseCode = 0;
		description = null;
	}
	
	public Integer getResponseCode() 
	{
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) 
	{
		this.responseCode = responseCode;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
}
