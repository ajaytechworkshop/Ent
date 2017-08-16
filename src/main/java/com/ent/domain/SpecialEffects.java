package com.ent.domain;

public class SpecialEffects
{
	
	/** The spl effects supervisor. */
	private String splEffectsSupervisor;
	
	/** The spl effects assistant. */
	private String splEffectsAssistant;

	public String getSplEffectsSupervisor()
	{
		return splEffectsSupervisor;
	}

	public void setSplEffectsSupervisor(String splEffectsSupervisor)
	{
		this.splEffectsSupervisor = splEffectsSupervisor;
	}

	public String getSplEffectsAssistant()
	{
		return splEffectsAssistant;
	}

	public void setSplEffectsAssistant(String splEffectsAssistant)
	{
		this.splEffectsAssistant = splEffectsAssistant;
	}

	@Override
	public String toString()
	{
		return "SpecialEffects [splEffectsSupervisor=" + splEffectsSupervisor + ", splEffectsAssistant="
				+ splEffectsAssistant + "]";
	}
	
}
