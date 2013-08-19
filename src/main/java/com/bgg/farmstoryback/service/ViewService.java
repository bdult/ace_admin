package com.bgg.farmstoryback.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgg.farmstoryback.dao.ViewDao;

@Service
public class ViewService {

		@Autowired
		private ViewDao viewDao;
		
		public List<HashMap<String, String>> memberList() {
			return viewDao.memberList();
		}
}
