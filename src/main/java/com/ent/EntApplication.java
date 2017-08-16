package com.ent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ent.domain.AdditionalProdCredits;
import com.ent.domain.ArtDepartment;
import com.ent.domain.Camera;
import com.ent.domain.Cast;
import com.ent.domain.Costume;
import com.ent.domain.Crew;
import com.ent.domain.Direction;
import com.ent.domain.Film;
import com.ent.domain.Grip;
import com.ent.domain.HairAndMakeup;
import com.ent.domain.Location;
import com.ent.domain.PostProduction;
import com.ent.domain.Production;
import com.ent.domain.SoundAndMusic;
import com.ent.domain.SoundProduction;
import com.ent.domain.SoundTrack;
import com.ent.domain.SpecialEffects;
import com.ent.util.Genre;
import com.ent.util.Language;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class EntApplication 
{

	public static void main(String[] args) throws JsonProcessingException   
	{
		SpringApplication.run(EntApplication.class, args);
		
		Film film = new Film();
		film.setName("My Film");
		film.setGenre(Genre.ACTION);
		film.setLang(Language.TAMIL);
		film.setLength("3");
		film.setRating("10");
		film.setStoryBase("Book");
		film.setStoryLine("1");
		
		Crew crew = new Crew();
		crew.setAdditionalProductionCredits(new AdditionalProdCredits());
		crew.setArtDepartment(new ArtDepartment());
		crew.setCamera(new Camera());
		crew.setCostumeDepartment(new Costume());
		crew.setDirectionCrew(new Direction());
		crew.setGrip(new Grip());
		crew.setLocationsCrew(new Location());
		crew.setMakeUpCrew(new HairAndMakeup());
		crew.setPostProduction(new PostProduction());
		crew.setProductionCrew(new Production());
		crew.setSoundAndMusic(new SoundAndMusic());
		crew.setSoundProduction(new SoundProduction());
		crew.setSpecialEffects(new SpecialEffects());
		film.setCrew(crew);
		
		List<Cast> crewList = new ArrayList<>();
		Cast cast = new Cast();
		crewList.add(cast);
		film.setCasts(crewList);
		
		film.setSoundTrack(new SoundTrack());
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Film to Json.."+mapper.writeValueAsString(film));
		
	}
}
