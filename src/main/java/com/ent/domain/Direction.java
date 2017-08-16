package com.ent.domain;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class DirectionCrew.
 */
public class Direction
{
	
	/** The director. */
	private String director;
	
	/** The co director. */
	private String coDirector;
	
	/** The associate director. */
	private String associateDirector;
	
	/** The assistant directors. */
	private List<String> assistantDirectors;

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}

	public String getCoDirector()
	{
		return coDirector;
	}

	public void setCoDirector(String coDirector)
	{
		this.coDirector = coDirector;
	}

	public String getAssociateDirector()
	{
		return associateDirector;
	}

	public void setAssociateDirector(String associateDirector)
	{
		this.associateDirector = associateDirector;
	}

	public List<String> getAssistantDirectors()
	{
		return assistantDirectors;
	}

	public void setAssistantDirectors(List<String> assistantDirectors)
	{
		this.assistantDirectors = assistantDirectors;
	}

	@Override
	public String toString()
	{
		return "DirectionCrew [director=" + director + ", coDirector=" + coDirector + ", associateDirector="
				+ associateDirector + ", assistantDirectors=" + assistantDirectors + "]";
	}
	
	
}
