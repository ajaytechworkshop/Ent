package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Crew.
 */
public class Crew
{
	
	/** The production crew. */
	private Production productionCrew;
	
	/** The direction crew. */
	private Direction directionCrew;
	
	/** The locations crew. */
	private Location locationsCrew;
	
	/** The additional production credits. */
	private AdditionalProdCredits additionalProductionCredits;
	
	/** The art department. */
	private ArtDepartment artDepartment;
	
	/** The costume department. */
	private Costume costumeDepartment;
	
	/** The make up crew. */
	private HairAndMakeup makeUpCrew;
	
	/** The special effects. */
	private SpecialEffects specialEffects;
	
	/** The camera. */
	private Camera camera;
	
	/** The sound production. */
	private SoundProduction soundProduction;
	
	/** The grip. */
	private Grip grip;
	
	/** The post production. */
	private PostProduction postProduction;
	
	/** The sound and music. */
	private SoundAndMusic soundAndMusic;

	public Production getProductionCrew()
	{
		return productionCrew;
	}

	public void setProductionCrew(Production productionCrew)
	{
		this.productionCrew = productionCrew;
	}

	public Direction getDirectionCrew()
	{
		return directionCrew;
	}

	public void setDirectionCrew(Direction directionCrew)
	{
		this.directionCrew = directionCrew;
	}

	public Location getLocationsCrew()
	{
		return locationsCrew;
	}

	public void setLocationsCrew(Location locationsCrew)
	{
		this.locationsCrew = locationsCrew;
	}

	public AdditionalProdCredits getAdditionalProductionCredits()
	{
		return additionalProductionCredits;
	}

	public void setAdditionalProductionCredits(AdditionalProdCredits additionalProductionCredits)
	{
		this.additionalProductionCredits = additionalProductionCredits;
	}

	public ArtDepartment getArtDepartment()
	{
		return artDepartment;
	}

	public void setArtDepartment(ArtDepartment artDepartment)
	{
		this.artDepartment = artDepartment;
	}

	public Costume getCostumeDepartment()
	{
		return costumeDepartment;
	}

	public void setCostumeDepartment(Costume costumeDepartment)
	{
		this.costumeDepartment = costumeDepartment;
	}

	public HairAndMakeup getMakeUpCrew()
	{
		return makeUpCrew;
	}

	public void setMakeUpCrew(HairAndMakeup makeUpCrew)
	{
		this.makeUpCrew = makeUpCrew;
	}

	public SpecialEffects getSpecialEffects()
	{
		return specialEffects;
	}

	public void setSpecialEffects(SpecialEffects specialEffects)
	{
		this.specialEffects = specialEffects;
	}

	public Camera getCamera()
	{
		return camera;
	}

	public void setCamera(Camera camera)
	{
		this.camera = camera;
	}

	public SoundProduction getSoundProduction()
	{
		return soundProduction;
	}

	public void setSoundProduction(SoundProduction soundProduction)
	{
		this.soundProduction = soundProduction;
	}

	public Grip getGrip()
	{
		return grip;
	}

	public void setGrip(Grip grip)
	{
		this.grip = grip;
	}

	public PostProduction getPostProduction()
	{
		return postProduction;
	}

	public void setPostProduction(PostProduction postProduction)
	{
		this.postProduction = postProduction;
	}

	public SoundAndMusic getSoundAndMusic()
	{
		return soundAndMusic;
	}

	public void setSoundAndMusic(SoundAndMusic soundAndMusic)
	{
		this.soundAndMusic = soundAndMusic;
	}

	@Override
	public String toString()
	{
		return "Crew [productionCrew=" + productionCrew.toString() + ", directionCrew=" + directionCrew.toString() + ", locationsCrew="
				+ locationsCrew.toString() + ", additionalProductionCredits=" + additionalProductionCredits.toString() + ", artDepartment="
				+ artDepartment.toString() + ", costumeDepartment=" + costumeDepartment.toString() + ", makeUpCrew=" + makeUpCrew.toString()
				+ ", specialEffects=" + specialEffects.toString() + ", camera=" + camera.toString() + ", soundProduction=" + soundProduction.toString()
				+ ", grip=" + grip.toString() + ", postProduction=" + postProduction.toString() + ", soundAndMusic=" + soundAndMusic.toString() + "]";
	}
	
}
