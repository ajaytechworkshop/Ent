package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class LocationCrew.
 */
public class Location
{
	
	/** The location manager. */
	private String locationManager;
	
	/** The assist location manager. */
	private String assistLocationManager;
	
	/** The location scout. */
	private String locationScout;
	
	/** The location assistant. */
	private String locationAssistant;
	
	/** The location prod assistant. */
	private String locationProdAssistant;

	public String getLocationManager()
	{
		return locationManager;
	}

	public void setLocationManager(String locationManager)
	{
		this.locationManager = locationManager;
	}

	public String getAssistLocationManager()
	{
		return assistLocationManager;
	}

	public void setAssistLocationManager(String assistLocationManager)
	{
		this.assistLocationManager = assistLocationManager;
	}

	public String getLocationScout()
	{
		return locationScout;
	}

	public void setLocationScout(String locationScout)
	{
		this.locationScout = locationScout;
	}

	public String getLocationAssistant()
	{
		return locationAssistant;
	}

	public void setLocationAssistant(String locationAssistant)
	{
		this.locationAssistant = locationAssistant;
	}

	public String getLocationProdAssistant()
	{
		return locationProdAssistant;
	}

	public void setLocationProdAssistant(String locationProdAssistant)
	{
		this.locationProdAssistant = locationProdAssistant;
	}

	@Override
	public String toString()
	{
		return "LocationCrew [locationManager=" + locationManager + ", assistLocationManager=" + assistLocationManager
				+ ", locationScout=" + locationScout + ", locationAssistant=" + locationAssistant
				+ ", locationProdAssistant=" + locationProdAssistant + "]";
	}
}
