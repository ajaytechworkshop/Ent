package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class ConstructionCrew.
 */
public class Construction
{
	
	/** The construction coordinator. */
	private String constructionCoordinator;
	
	/** The head carpenter. */
	private String headCarpenter;
	
	/** The key scenic. */
	private String keyScenic;

	public String getConstructionCoordinator()
	{
		return constructionCoordinator;
	}

	public void setConstructionCoordinator(String constructionCoordinator)
	{
		this.constructionCoordinator = constructionCoordinator;
	}

	public String getHeadCarpenter()
	{
		return headCarpenter;
	}

	public void setHeadCarpenter(String headCarpenter)
	{
		this.headCarpenter = headCarpenter;
	}

	public String getKeyScenic()
	{
		return keyScenic;
	}

	public void setKeyScenic(String keyScenic)
	{
		this.keyScenic = keyScenic;
	}

	@Override
	public String toString()
	{
		return "ConstructionCrew [constructionCoordinator=" + constructionCoordinator + ", headCarpenter="
				+ headCarpenter + ", keyScenic=" + keyScenic + "]";
	}
}
