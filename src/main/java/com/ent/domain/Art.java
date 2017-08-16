package com.ent.domain;

public class Art
{
	
	/** The art director. */
	private String artDirector;
	
	/** The asst art director. */
	private String asstArtDirector;
	
	/** The illustrator. */
	private String illustrator;
	
	/** The graphic artist. */
	private String graphicArtist;
	
	public String getArtDirector()
	{
		return artDirector;
	}
	public void setArtDirector(String artDirector)
	{
		this.artDirector = artDirector;
	}
	public String getAsstArtDirector()
	{
		return asstArtDirector;
	}
	public void setAsstArtDirector(String asstArtDirector)
	{
		this.asstArtDirector = asstArtDirector;
	}
	public String getIllustrator()
	{
		return illustrator;
	}
	public void setIllustrator(String illustrator)
	{
		this.illustrator = illustrator;
	}
	public String getGraphicArtist()
	{
		return graphicArtist;
	}
	public void setGraphicArtist(String graphicArtist)
	{
		this.graphicArtist = graphicArtist;
	}
	
	@Override
	public String toString()
	{
		return "ArtCrew [artDirector=" + artDirector + ", asstArtDirector=" + asstArtDirector + ", illustrator="
				+ illustrator + ", graphicArtist=" + graphicArtist + "]";
	}
}
