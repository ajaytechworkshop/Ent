package com.ent.domain;

import java.util.Map;

import com.ent.util.Grips;

// TODO: Auto-generated Javadoc
/**
 * The Class Grip.
 */
public class Grip
{
	
	/** The key grip. */
	private String keyGrip;
	
	/** The best boy. */
	private String bestBoy;
	
	/** The dolly grip. */
	private String dollyGrip;
	
	/** The grips. */
	private Map<Grips, String> grips;

	public String getKeyGrip()
	{
		return keyGrip;
	}

	public void setKeyGrip(String keyGrip)
	{
		this.keyGrip = keyGrip;
	}

	public String getBestBoy()
	{
		return bestBoy;
	}

	public void setBestBoy(String bestBoy)
	{
		this.bestBoy = bestBoy;
	}

	public String getDollyGrip()
	{
		return dollyGrip;
	}

	public void setDollyGrip(String dollyGrip)
	{
		this.dollyGrip = dollyGrip;
	}

	public Map<Grips, String> getGrips()
	{
		return grips;
	}

	public void setGrips(Map<Grips, String> grips)
	{
		this.grips = grips;
	}

	@Override
	public String toString()
	{
		return "Grip [keyGrip=" + keyGrip + ", bestBoy=" + bestBoy + ", dollyGrip=" + dollyGrip + ", grips=" + grips
				+ "]";
	}
}
