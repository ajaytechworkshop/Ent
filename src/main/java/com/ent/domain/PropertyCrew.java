package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyCrew.
 */
public class PropertyCrew
{
	
	/** The property manager. */
	private String propertyManager;
	
	/** The property maker. */
	private String propertyMaker;
	
	/** The weapons master. */
	private String weaponsMaster;

	public String getPropertyManager()
	{
		return propertyManager;
	}

	public void setPropertyManager(String propertyManager)
	{
		this.propertyManager = propertyManager;
	}

	public String getPropertyMaker()
	{
		return propertyMaker;
	}

	public void setPropertyMaker(String propertyMaker)
	{
		this.propertyMaker = propertyMaker;
	}

	public String getWeaponsMaster()
	{
		return weaponsMaster;
	}

	public void setWeaponsMaster(String weaponsMaster)
	{
		this.weaponsMaster = weaponsMaster;
	}

	@Override
	public String toString()
	{
		return "PropertyCrew [propertyManager=" + propertyManager + ", propertyMaker=" + propertyMaker
				+ ", weaponsMaster=" + weaponsMaster + "]";
	}
}
