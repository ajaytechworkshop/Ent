package com.ent.domain;

public class Music
{
	
	/** The music supervisor. */
	private String musicSupervisor;
	
	/** The composer. */
	private String composer;
	
	/** The foley artist. */
	private String foleyArtist;

	public String getMusicSupervisor()
	{
		return musicSupervisor;
	}

	public void setMusicSupervisor(String musicSupervisor)
	{
		this.musicSupervisor = musicSupervisor;
	}

	public String getComposer()
	{
		return composer;
	}

	public void setComposer(String composer)
	{
		this.composer = composer;
	}

	public String getFoleyArtist()
	{
		return foleyArtist;
	}

	public void setFoleyArtist(String foleyArtist)
	{
		this.foleyArtist = foleyArtist;
	}

	@Override
	public String toString()
	{
		return "Music [musicSupervisor=" + musicSupervisor + ", composer=" + composer + ", foleyArtist=" + foleyArtist
				+ "]";
	}
}
