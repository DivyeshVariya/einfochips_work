package com.example.Day24_Assignment.Dao;

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
//	@Modifying
	@Query("DELETE from movie m WHERE m.moviename = :moviename")
    void deleteBymoviename(String moviename);
}
