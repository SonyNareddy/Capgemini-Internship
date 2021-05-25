package com.app.dca.DevApplication.bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Feed {

	private int feedId;
	private String query;
	private LocalDate feedDate;
	private LocalTime feedTime;
	private String topic;	// Programming/Java/Testing
	private int relevance;	// Likes on Feed increase relevance

	@ManyToOne
	private Developer dev;
	private List<Response> responses;
	private int totalComments;
	
}
