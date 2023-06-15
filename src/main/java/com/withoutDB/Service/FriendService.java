package com.withoutDB.Service;

import java.util.List;

import com.withoutDB.Entity.Friend;

public interface FriendService {
	

	public boolean saveFriend(Friend friend);
	public Object  getAllFriend();
	public Friend getFriendById(Long id);
	public boolean deleteFriendById(Long id);
	public boolean updateFriend(Friend friend);
	
	public List<Friend> sortFriendById();
	public List<Friend> sortFriendByName();
	
	public Integer getCount();

}
