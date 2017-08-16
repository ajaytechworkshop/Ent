package com.ent.domain;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Camera.
 */
public class Camera
{
	
	/** The cinematographer. */
	private String cinematographer;
	
	/** The photography director. */
	private String photographyDirector;
	
	/** The camera operator. */
	private String cameraOperator;
	
	/** The assistant camera men. */
	private List<String> assistantCameraMen;
	
	/** The film loader. */
	private String filmLoader;
	
	/** The camera prod assistant. */
	private String cameraProdAssistant;
	
	/** The digital imaging technician. */
	private String digitalImagingTechnician;
	
	/** The steadicam operator. */
	private String steadicamOperator;
	
	/** The motion control technician. */
	private String motionControlTechnician;

	public String getCinematographer()
	{
		return cinematographer;
	}

	public void setCinematographer(String cinematographer)
	{
		this.cinematographer = cinematographer;
	}

	public String getPhotographyDirector()
	{
		return photographyDirector;
	}

	public void setPhotographyDirector(String photographyDirector)
	{
		this.photographyDirector = photographyDirector;
	}

	public String getCameraOperator()
	{
		return cameraOperator;
	}

	public void setCameraOperator(String cameraOperator)
	{
		this.cameraOperator = cameraOperator;
	}

	public List<String> getAssistantCameraMen()
	{
		return assistantCameraMen;
	}

	public void setAssistantCameraMen(List<String> assistantCameraMen)
	{
		this.assistantCameraMen = assistantCameraMen;
	}

	public String getFilmLoader()
	{
		return filmLoader;
	}

	public void setFilmLoader(String filmLoader)
	{
		this.filmLoader = filmLoader;
	}

	public String getCameraProdAssistant()
	{
		return cameraProdAssistant;
	}

	public void setCameraProdAssistant(String cameraProdAssistant)
	{
		this.cameraProdAssistant = cameraProdAssistant;
	}

	public String getDigitalImagingTechnician()
	{
		return digitalImagingTechnician;
	}

	public void setDigitalImagingTechnician(String digitalImagingTechnician)
	{
		this.digitalImagingTechnician = digitalImagingTechnician;
	}

	public String getSteadicamOperator()
	{
		return steadicamOperator;
	}

	public void setSteadicamOperator(String steadicamOperator)
	{
		this.steadicamOperator = steadicamOperator;
	}

	public String getMotionControlTechnician()
	{
		return motionControlTechnician;
	}

	public void setMotionControlTechnician(String motionControlTechnician)
	{
		this.motionControlTechnician = motionControlTechnician;
	}

	@Override
	public String toString()
	{
		return "Camera [cinematographer=" + cinematographer + ", photographyDirector=" + photographyDirector
				+ ", cameraOperator=" + cameraOperator + ", assistantCameraMen=" + assistantCameraMen + ", filmLoader="
				+ filmLoader + ", cameraProdAssistant=" + cameraProdAssistant + ", digitalImagingTechnician="
				+ digitalImagingTechnician + ", steadicamOperator=" + steadicamOperator + ", motionControlTechnician="
				+ motionControlTechnician + "]";
	}
}
