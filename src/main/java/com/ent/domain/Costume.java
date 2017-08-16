package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Costume.
 */
public class Costume
{
	
	/** The costume designer. */
	private String costumeDesigner;
	
	/** The costume supervisor. */
	private String costumeSupervisor;
	
	/** The key costumer. */
	private String keyCostumer;
	
	/** The costume stand by. */
	private String costumeStandBy;
	
	/** The art finisher. */
	private String artFinisher;
	
	/** The costume buyer. */
	private String costumeBuyer;
	
	/** The cutter. */
	private String cutter;

	public String getCostumeDesigner()
	{
		return costumeDesigner;
	}

	public void setCostumeDesigner(String costumeDesigner)
	{
		this.costumeDesigner = costumeDesigner;
	}

	public String getCostumeSupervisor()
	{
		return costumeSupervisor;
	}

	public void setCostumeSupervisor(String costumeSupervisor)
	{
		this.costumeSupervisor = costumeSupervisor;
	}

	public String getKeyCostumer()
	{
		return keyCostumer;
	}

	public void setKeyCostumer(String keyCostumer)
	{
		this.keyCostumer = keyCostumer;
	}

	public String getCostumeStandBy()
	{
		return costumeStandBy;
	}

	public void setCostumeStandBy(String costumeStandBy)
	{
		this.costumeStandBy = costumeStandBy;
	}

	public String getArtFinisher()
	{
		return artFinisher;
	}

	public void setArtFinisher(String artFinisher)
	{
		this.artFinisher = artFinisher;
	}

	public String getCostumeBuyer()
	{
		return costumeBuyer;
	}

	public void setCostumeBuyer(String costumeBuyer)
	{
		this.costumeBuyer = costumeBuyer;
	}

	public String getCutter()
	{
		return cutter;
	}

	public void setCutter(String cutter)
	{
		this.cutter = cutter;
	}

	@Override
	public String toString()
	{
		return "Costume [costumeDesigner=" + costumeDesigner + ", costumeSupervisor=" + costumeSupervisor
				+ ", keyCostumer=" + keyCostumer + ", costumeStandBy=" + costumeStandBy + ", artFinisher=" + artFinisher
				+ ", costumeBuyer=" + costumeBuyer + ", cutter=" + cutter + "]";
	}
}
