package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Cast.
 */
public class Cast
{
	
	/** The character name. */
	private String characterName;
	
	/** The Artist. */
	private String Artist;
	
	/** The dubbing. */
	private String dubbing;

	public String getCharacterName()
	{
		return characterName;
	}

	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}

	public String getArtist()
	{
		return Artist;
	}

	public void setArtist(String artist)
	{
		Artist = artist;
	}

	public String getDubbing()
	{
		return dubbing;
	}

	public void setDubbing(String dubbing)
	{
		this.dubbing = dubbing;
	}

	@Override
	public String toString()
	{
		return "Cast [characterName=" + characterName + ", Artist=" + Artist + ", dubbing=" + dubbing + "]";
	}
	
}
