package com.withoutDB.DAO;

import java.util.List;

import com.withoutDB.Entity.Friend;


public interface FriendDao {
	
	public boolean saveFriend(Friend friend);
	public Object  getAllFriend();
	public Friend getFriendById(Long id);
	public boolean deleteFriendById(Long id);
	public boolean updateFriend(Friend friend);
	
	

}
