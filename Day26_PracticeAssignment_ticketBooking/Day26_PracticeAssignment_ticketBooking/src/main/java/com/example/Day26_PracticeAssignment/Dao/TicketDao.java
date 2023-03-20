package com.example.Day26_PracticeAssignment.Dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Day26_PracticeAssignment.model.Show;
import com.example.Day26_PracticeAssignment.model.Ticket;

public interface TicketDao extends MongoRepository<Ticket, String>{
	
	Optional<Ticket> findByBookingDate(String bookingDate);

}
