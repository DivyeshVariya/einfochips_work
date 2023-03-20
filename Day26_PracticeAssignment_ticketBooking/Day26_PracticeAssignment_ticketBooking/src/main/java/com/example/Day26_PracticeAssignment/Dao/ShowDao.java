package com.example.Day26_PracticeAssignment.Dao;

import java.util.List;
import java.util.Optional;

import org.bson.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Day26_PracticeAssignment.model.Show;
import com.example.Day26_PracticeAssignment.model.Ticket;


public interface ShowDao extends MongoRepository<Show,String>{
//	@Query("query with MovieName, ShowDate, ShowTime")
//	List<Show> findByMovieNameAndShowDateAndShowTime();
	Optional<Show> findByMnameAndSdateAndSname(String mname,String sdate,String sname);
	Optional<Show> findByBookingDate(String bookingDate);
}
