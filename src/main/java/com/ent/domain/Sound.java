package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Sound.
 */
public class Sound
{
	
	/** The sound designer. */
	private String soundDesigner;
	
	/** The dialogue editor. */
	private String dialogueEditor;
	
	/** The sound editor. */
	private String soundEditor;
	
	/** The re recording mixer. */
	private String reRecordingMixer;

	public String getSoundDesigner()
	{
		return soundDesigner;
	}

	public void setSoundDesigner(String soundDesigner)
	{
		this.soundDesigner = soundDesigner;
	}

	public String getDialogueEditor()
	{
		return dialogueEditor;
	}

	public void setDialogueEditor(String dialogueEditor)
	{
		this.dialogueEditor = dialogueEditor;
	}

	public String getSoundEditor()
	{
		return soundEditor;
	}

	public void setSoundEditor(String soundEditor)
	{
		this.soundEditor = soundEditor;
	}

	public String getReRecordingMixer()
	{
		return reRecordingMixer;
	}

	public void setReRecordingMixer(String reRecordingMixer)
	{
		this.reRecordingMixer = reRecordingMixer;
	}

	@Override
	public String toString()
	{
		return "Sound [soundDesigner=" + soundDesigner + ", dialogueEditor=" + dialogueEditor + ", soundEditor="
				+ soundEditor + ", reRecordingMixer=" + reRecordingMixer + "]";
	}
}
