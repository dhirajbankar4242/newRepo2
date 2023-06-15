package com.withoutDB.Service;

import java.util.Comparator;

import com.withoutDB.Entity.Friend;

public class sortByName implements Comparator<Friend> {

	@Override
	public int compare(Friend o1, Friend o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
