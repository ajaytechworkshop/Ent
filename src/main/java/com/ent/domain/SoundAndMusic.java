package com.ent.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class SoundAndMusic.
 */
public class SoundAndMusic
{
	
	/** The music crew. */
	private Music musicCrew;
	
	/** The sound crew. */
	private Sound soundCrew;

	public Music getMusicCrew()
	{
		return musicCrew;
	}

	public void setMusicCrew(Music musicCrew)
	{
		this.musicCrew = musicCrew;
	}

	public Sound getSoundCrew()
	{
		return soundCrew;
	}

	public void setSoundCrew(Sound soundCrew)
	{
		this.soundCrew = soundCrew;
	}

	@Override
	public String toString()
	{
		return "SoundAndMusic [musicCrew=" + musicCrew.toString() + ", soundCrew=" + soundCrew.toString() + "]";
	}
	
}
