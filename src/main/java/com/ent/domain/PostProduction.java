package com.ent.domain;

public class PostProduction
{
	
	/** The editorial. */
	private Editorial editorial;
	
	/** The visual effects. */
	private VisualEffects visualEffects;

	public Editorial getEditorial()
	{
		return editorial;
	}

	public void setEditorial(Editorial editorial)
	{
		this.editorial = editorial;
	}

	public VisualEffects getVisualEffects()
	{
		return visualEffects;
	}

	public void setVisualEffects(VisualEffects visualEffects)
	{
		this.visualEffects = visualEffects;
	}

	@Override
	public String toString()
	{
		return "PostProduction [editorial=" + editorial.toString() + ", visualEffects=" + visualEffects.toString() + "]";
	}
}
