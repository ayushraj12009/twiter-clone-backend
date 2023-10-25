package com.ayush.service;

import java.util.List;

import com.ayush.exception.TwitException;
import com.ayush.exception.UserException;
import com.ayush.model.Twit;
import com.ayush.model.User;
import com.ayush.request.TwitReplyRequest;

public interface TwitService {

	public Twit createTwit(Twit req, User user) throws UserException;
	
	public List<Twit> findAllTwit();
	public Twit retwit(Long twitId, User user) throws UserException, TwitException;
	public Twit findById(Long twitId) throws TwitException;
	public void deletTwitById(Long twitId, Long userId) throws TwitException, UserException;
	public Twit removeFromRetwit(Long twitId, User user) throws TwitException, UserException;
	public Twit createdReply(TwitReplyRequest req, User user) throws TwitException;
	public List<Twit> getUserTwit(User user);
	public List<Twit> findByLikesContainsUser(User user);
	
	
	
	
}
