package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class SoundProduction.
 */
public class SoundProduction
{
	
	/** The prod sound mixer. */
	private String prodSoundMixer;
	
	/** The boom operator. */
	private String boomOperator;
	
	/** The utilty sound technician. */
	private String utiltySoundTechnician;

	public String getProdSoundMixer()
	{
		return prodSoundMixer;
	}

	public void setProdSoundMixer(String prodSoundMixer)
	{
		this.prodSoundMixer = prodSoundMixer;
	}

	public String getBoomOperator()
	{
		return boomOperator;
	}

	public void setBoomOperator(String boomOperator)
	{
		this.boomOperator = boomOperator;
	}

	public String getUtiltySoundTechnician()
	{
		return utiltySoundTechnician;
	}

	public void setUtiltySoundTechnician(String utiltySoundTechnician)
	{
		this.utiltySoundTechnician = utiltySoundTechnician;
	}

	@Override
	public String toString()
	{
		return "SoundProduction [prodSoundMixer=" + prodSoundMixer + ", boomOperator=" + boomOperator
				+ ", utiltySoundTechnician=" + utiltySoundTechnician + "]";
	}
}
