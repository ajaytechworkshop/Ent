package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class SoundTrack.
 */
public class SoundTrack
{
	
	/** The Composer. */
	private String Composer;
	
	/** The track number. */
	private String trackNumber;
	
	/** The title. */
	private String title;
	
	/** The singing artist. */
	private String singingArtist;
	
	/** The length. */
	private String length;
	
	/** The performed. */
	private String performed;

	public String getComposer()
	{
		return Composer;
	}

	public void setComposer(String composer)
	{
		Composer = composer;
	}

	public String getTrackNumber()
	{
		return trackNumber;
	}

	public void setTrackNumber(String trackNumber)
	{
		this.trackNumber = trackNumber;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getSingingArtist()
	{
		return singingArtist;
	}

	public void setSingingArtist(String singingArtist)
	{
		this.singingArtist = singingArtist;
	}

	public String getLength()
	{
		return length;
	}

	public void setLength(String length)
	{
		this.length = length;
	}

	public String getPerformed()
	{
		return performed;
	}

	public void setPerformed(String performed)
	{
		this.performed = performed;
	}

	@Override
	public String toString()
	{
		return "SoundTrack [Composer=" + Composer + ", trackNumber=" + trackNumber + ", title=" + title
				+ ", singingArtist=" + singingArtist + ", length=" + length + ", performed=" + performed + "]";
	}
}
