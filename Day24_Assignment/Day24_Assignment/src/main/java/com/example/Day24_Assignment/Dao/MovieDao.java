package com.example.Day24_Assignment.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Day24_Assignment.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer>{
	
	Optional<Movie> findBymoviename(String moviename);
	@Modifying
	@Query("delete from Movie m WHERE m.moviename= :moviename")
    int deleteBymoviename(@Param("moviename") String moviename);
	
	@Query("select m from Movie m where m.language= :language")
	List<Movie> findBylanguage(@Param("language") String language);
}
