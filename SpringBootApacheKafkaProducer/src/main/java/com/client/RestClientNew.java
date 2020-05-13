package com.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.learnkafka.domain.Book;
import com.learnkafka.domain.LibraryEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClientNew {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		 final String uri = "http://localhost:8082/v1/libraryevent";
		
		 ObjectMapper objectMapper = new ObjectMapper();
		 
		 Book book = new Book();
		 book.setBookId(777);
		 book.setBookAuthor("Samanta");
		 book.setBookName("Kafka using Spring Boot");
		 
				 
	     LibraryEvent libraryEvent = new LibraryEvent();
	     libraryEvent.setLibraryEventId(null);
	     libraryEvent.setBook(book);
	 
	     RestTemplate restTemplate = new RestTemplate();
	     LibraryEvent result = restTemplate.postForObject( uri, libraryEvent, LibraryEvent.class);
	 
	    System.out.println(result);
	    
	}

}
