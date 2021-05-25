package com.app.dca.DevApplication.service;

import java.util.List;

import com.app.dca.DevApplication.bean.Feed;
import com.app.dca.DevApplication.exception.UnknownDeveloperException;
import com.app.dca.DevApplication.exception.UnknownFeedException;



public interface IFeedService {

	Feed addFeed(Feed feed);
	
	Feed editFeed(Feed feed);
	
	Feed likeFeed(int feedId) throws UnknownFeedException;
	
	Feed getFeed(int feedId) throws UnknownFeedException;
	
	Feed removeFeed(int feedId) throws UnknownFeedException;
	
	List<Feed> getFeedsByDeveloper(int devId) throws UnknownDeveloperException;
	
	List<Feed> getFeedsByKeyword(String keyword);
	
	List<Feed> getFeedsByTopic(String topic);
}