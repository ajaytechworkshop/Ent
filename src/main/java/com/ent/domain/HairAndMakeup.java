package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class HairAndMakeup.
 */
public class HairAndMakeup
{
	
	/** The key make up artist. */
	private String keyMakeUpArtist;
	
	public String getKeyMakeUpArtist()
	{
		return keyMakeUpArtist;
	}

	public void setKeyMakeUpArtist(String keyMakeUpArtist)
	{
		this.keyMakeUpArtist = keyMakeUpArtist;
	}

	public String getMakeUpArtist()
	{
		return makeUpArtist;
	}

	public void setMakeUpArtist(String makeUpArtist)
	{
		this.makeUpArtist = makeUpArtist;
	}

	public String getHairDresser()
	{
		return hairDresser;
	}

	public void setHairDresser(String hairDresser)
	{
		this.hairDresser = hairDresser;
	}

	public String getSpecialEffectsMakeupArtist()
	{
		return specialEffectsMakeupArtist;
	}

	public void setSpecialEffectsMakeupArtist(String specialEffectsMakeupArtist)
	{
		this.specialEffectsMakeupArtist = specialEffectsMakeupArtist;
	}

	public String getMakeupSupervisor()
	{
		return makeupSupervisor;
	}

	public void setMakeupSupervisor(String makeupSupervisor)
	{
		this.makeupSupervisor = makeupSupervisor;
	}

	/** The make up artist. */
	private String makeUpArtist;
	
	/** The hair dresser. */
	private String hairDresser;
	
	/** The special effects makeup artist. */
	private String specialEffectsMakeupArtist;
	
	/** The makeup supervisor. */
	private String makeupSupervisor;

	@Override
	public String toString()
	{
		return "HairAndMakeup [keyMakeUpArtist=" + keyMakeUpArtist + ", makeUpArtist=" + makeUpArtist + ", hairDresser="
				+ hairDresser + ", specialEffectsMakeupArtist=" + specialEffectsMakeupArtist + ", makeupSupervisor="
				+ makeupSupervisor + "]";
	}
}
