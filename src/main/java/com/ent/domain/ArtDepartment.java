package com.ent.domain;

public class ArtDepartment
{
	
	/** The production designer. */
	private String productionDesigner;
	
	/** The atr crew. */
	private Art atrCrew;
	
	/** The sets crew. */
	private Sets setsCrew;
	
	/** The construction crew. */
	private Construction constructionCrew;
	
	/** The property crew. */
	private PropertyCrew propertyCrew;

	
	public String getProductionDesigner()
	{
		return productionDesigner;
	}

	public void setProductionDesigner(String productionDesigner)
	{
		this.productionDesigner = productionDesigner;
	}

	public Art getAtrCrew()
	{
		return atrCrew;
	}

	public void setAtrCrew(Art atrCrew)
	{
		this.atrCrew = atrCrew;
	}

	public Sets getSetsCrew()
	{
		return setsCrew;
	}

	public void setSetsCrew(Sets setsCrew)
	{
		this.setsCrew = setsCrew;
	}

	public Construction getConstructionCrew()
	{
		return constructionCrew;
	}

	public void setConstructionCrew(Construction constructionCrew)
	{
		this.constructionCrew = constructionCrew;
	}

	public PropertyCrew getPropertyCrew()
	{
		return propertyCrew;
	}

	public void setPropertyCrew(PropertyCrew propertyCrew)
	{
		this.propertyCrew = propertyCrew;
	}

	@Override
	public String toString()
	{
		return "ArtDepartment [atrCrew=" + atrCrew.toString() + ", setsCrew=" + setsCrew.toString() + ", constructionCrew=" + constructionCrew.toString()
				+ ", propertyCrew=" + propertyCrew.toString() + "]";
	}
	
}
