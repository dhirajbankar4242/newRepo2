package com.withoutDB.Service;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withoutDB.DAO.FriendDao;
import com.withoutDB.Entity.Friend;

@Service
public class FriendServiceImpl implements FriendService{
	
	@Autowired
	FriendDao dao;

	@Override
	public boolean saveFriend(Friend friend) {
		
		String id = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		friend.setId(Long.parseLong(id));
		boolean ifExist = dao.saveFriend(friend);
		return ifExist;
	}

	@Override
	public Object  getAllFriend() {
		Object allFriend = dao.getAllFriend();
		return allFriend;
	}

	@Override
	public Friend getFriendById(Long id) {
		Friend friendById = dao.getFriendById(id);
		return friendById;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteFriendById(Long id) {
		boolean deleteFriendById = dao.deleteFriendById(id);
		return deleteFriendById;
	}

	@Override
	public boolean updateFriend(Friend friend) {
		boolean updateFriend = dao.updateFriend(friend);
		return updateFriend;
	}

	@Override
	public List<Friend> sortFriendById() {
		List<Friend> allFriend = (List<Friend>) getAllFriend();
		Collections.sort(allFriend);
		return allFriend;
	}

	@Override
	public List<Friend> sortFriendByName() {
		List<Friend> allFriend = (List<Friend>) getAllFriend();
		Collections.sort(allFriend, new sortByName());
		return allFriend;
	}

	@Override
	public Integer getCount() {
		List allFriend = (List) dao.getAllFriend();
		int size = allFriend.size();
		return size;
	}
	

//	@Override
//	public List<Friend> sortFriendById() {
//		List<Friend> sortFriendById = dao.sortFriendById();
//		return sortFriendById;
//	}
//
//	@Override
//	public List<Friend> sortFriendByName() {
//		List<Friend> sortFriendByName = dao.sortFriendByName();
//		return sortFriendByName;
//	}
	
	
	

}
