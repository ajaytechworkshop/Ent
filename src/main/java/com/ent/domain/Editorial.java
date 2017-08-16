package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Editorial.
 */
public class Editorial
{
	
	/** The film editor. */
	private String filmEditor;
	
	/** The negative cutter. */
	private String negativeCutter;
	
	/** The colorist. */
	private String colorist;
	
	/** The telecine colorist. */
	private String telecineColorist;

	public String getFilmEditor()
	{
		return filmEditor;
	}

	public void setFilmEditor(String filmEditor)
	{
		this.filmEditor = filmEditor;
	}

	public String getNegativeCutter()
	{
		return negativeCutter;
	}

	public void setNegativeCutter(String negativeCutter)
	{
		this.negativeCutter = negativeCutter;
	}

	public String getColorist()
	{
		return colorist;
	}

	public void setColorist(String colorist)
	{
		this.colorist = colorist;
	}

	public String getTelecineColorist()
	{
		return telecineColorist;
	}

	public void setTelecineColorist(String telecineColorist)
	{
		this.telecineColorist = telecineColorist;
	}

	@Override
	public String toString()
	{
		return "Editorial [filmEditor=" + filmEditor + ", negativeCutter=" + negativeCutter + ", colorist=" + colorist
				+ ", telecineColorist=" + telecineColorist + "]";
	}
	
}
