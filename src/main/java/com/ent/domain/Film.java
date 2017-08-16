package com.ent.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.ent.util.Genre;
import com.ent.util.Language;

// TODO: Auto-generated Javadoc
/**
 * The Class Film.
 */
public class Film 
{
	
	/** The id. */
	@Id
	private String id;
	
	/** The name. */
	private String name;
	
	/** The lang. */
	private Language lang;
	
	/** The length. */
	private String length;
	
	/** The genre. */
	private Genre genre;
	
	/** The rating. */
	private String rating;
	
	/** The story base. */
	private String storyBase;
	
	/** The story line. */
	private String storyLine;
	
	/** The casts. */
	private List<Cast> casts;
	
	/** The sound track. */
	private SoundTrack soundTrack;
	
	/** The crew. */
	private Crew crew;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Language getLang()
	{
		return lang;
	}

	public void setLang(Language lang)
	{
		this.lang = lang;
	}

	public String getLength()
	{
		return length;
	}

	public void setLength(String length)
	{
		this.length = length;
	}

	public Genre getGenre()
	{
		return genre;
	}

	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public String getStoryBase()
	{
		return storyBase;
	}

	public void setStoryBase(String storyBase)
	{
		this.storyBase = storyBase;
	}

	public String getStoryLine()
	{
		return storyLine;
	}

	public void setStoryLine(String storyLine)
	{
		this.storyLine = storyLine;
	}

	public List<Cast> getCasts()
	{
		return casts;
	}

	public void setCasts(List<Cast> casts)
	{
		this.casts = casts;
	}

	public SoundTrack getSoundTrack()
	{
		return soundTrack;
	}

	public void setSoundTrack(SoundTrack soundTrack)
	{
		this.soundTrack = soundTrack;
	}

	public Crew getCrew()
	{
		return crew;
	}

	public void setCrew(Crew crew)
	{
		this.crew = crew;
	}

	@Override
	public String toString()
	{
		return "Film [id=" + id + ", name=" + name + ", lang=" + lang + ", length=" + length + ", genre=" + genre
				+ ", rating=" + rating + ", storyBase=" + storyBase + ", storyLine=" + storyLine + ", casts=" + casts.toString()
				+ ", soundTrack=" + soundTrack.toString() + ", crew=" + crew.toString() + "]";
	}
	
	
	
}
