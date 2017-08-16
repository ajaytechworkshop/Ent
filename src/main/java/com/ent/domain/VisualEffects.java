package com.ent.domain;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class VisualEffects.
 */
public class VisualEffects
{
	
	/** The visula effects producer. */
	private String visulaEffectsProducer;
	
	/** The visual effects creative director. */
	private String visualEffectsCreativeDirector;
	
	/** The visual effects supervisor. */
	private String visualEffectsSupervisor;
	
	/** The visual effects editor. */
	private String visualEffectsEditor;
	
	/** The compositor. */
	private String compositor;
	
	/** The paint artists. */
	private List<String> paintArtists;
	
	/** The matte painter. */
	private String mattePainter;

	public String getVisulaEffectsProducer()
	{
		return visulaEffectsProducer;
	}

	public void setVisulaEffectsProducer(String visulaEffectsProducer)
	{
		this.visulaEffectsProducer = visulaEffectsProducer;
	}

	public String getVisualEffectsCreativeDirector()
	{
		return visualEffectsCreativeDirector;
	}

	public void setVisualEffectsCreativeDirector(String visualEffectsCreativeDirector)
	{
		this.visualEffectsCreativeDirector = visualEffectsCreativeDirector;
	}

	public String getVisualEffectsSupervisor()
	{
		return visualEffectsSupervisor;
	}

	public void setVisualEffectsSupervisor(String visualEffectsSupervisor)
	{
		this.visualEffectsSupervisor = visualEffectsSupervisor;
	}

	public String getVisualEffectsEditor()
	{
		return visualEffectsEditor;
	}

	public void setVisualEffectsEditor(String visualEffectsEditor)
	{
		this.visualEffectsEditor = visualEffectsEditor;
	}

	public String getCompositor()
	{
		return compositor;
	}

	public void setCompositor(String compositor)
	{
		this.compositor = compositor;
	}

	public List<String> getPaintArtists()
	{
		return paintArtists;
	}

	public void setPaintArtists(List<String> paintArtists)
	{
		this.paintArtists = paintArtists;
	}

	public String getMattePainter()
	{
		return mattePainter;
	}

	public void setMattePainter(String mattePainter)
	{
		this.mattePainter = mattePainter;
	}

	@Override
	public String toString()
	{
		return "VisualEffects [visulaEffectsProducer=" + visulaEffectsProducer + ", visualEffectsCreativeDirector="
				+ visualEffectsCreativeDirector + ", visualEffectsSupervisor=" + visualEffectsSupervisor
				+ ", visualEffectsEditor=" + visualEffectsEditor + ", compositor=" + compositor + ", paintArtists="
				+ paintArtists + ", mattePainter=" + mattePainter + "]";
	}
}
