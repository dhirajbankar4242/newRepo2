package com.withoutDB.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.withoutDB.Entity.Friend;

@Repository
public class FriendDaoImpl implements FriendDao {

	List<Friend> list = new ArrayList<>();
	
	@Override
	public boolean saveFriend(Friend friend) {
		String msg = null;
		boolean ifExist = false;
		for (Friend dbfriend : list) {
			if(dbfriend.getName().equalsIgnoreCase(friend.getName())) {
				ifExist = true;
				break;
			}			
		}
		if(!ifExist) {
			list.add(friend);
			return true;
		}else {
			return false;
		}	
	}

	@Override
	public Object getAllFriend() {
		String msg = null;
		if(list.isEmpty()) {
			msg = "list is eampty";
			return msg;
		}else {
			return list;
		}
		
	}


	@Override
	public Friend getFriendById(Long id) {
	    for (Friend friend : list) {
	        if (friend.getId().equals(id)) {
	            return friend;
	        }
	    }
	    return null; 
	}

	@Override
	public boolean deleteFriendById(Long id) {
		Iterator<Friend> iterator = list.iterator();
		while(iterator.hasNext()) {
			Friend  friend = iterator.next();
			if(friend.getId().equals(id)) {
				iterator.remove();				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateFriend(Friend friend) {
		for (Friend friend1 : list) {
			if(friend1.getId().equals(friend.getId())){
				list.set(list.indexOf(friend1), friend);
//				list.remove(friend1);
//				list.add(friend);
				return true;
			}
		}
		return false;
	}

//	@Override
//	public List<Friend> sortFriendById() {
//		Collections.sort(list);
//		return list;
//	}
//
//	@Override
//	public List<Friend> sortFriendByName() {
//		Collections.sort(list, new sortByName());
//		return list;
//	}


}
