package com.cn.hnust.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.DBRService;

@Service("DBRService")
public class DBRServiceImpl implements DBRService {

	@Resource
	private UserMapper mapper;
	
	@Override
	public List<User> getInfo() {
		// TODO Auto-generated method stub
		List<User> users = this.mapper.selectAllUser();
		Iterator<User> iterator = users.iterator();
		List<String[]> infos = new ArrayList<String[]>();
		while(iterator.hasNext()){
			User user = iterator.next();
			String[] info = user.getFavorite().split(",");
			infos.add(info);
		}
		
		System.out.println(infos.toString());
		for (int i = 0; i < infos.size(); i++) {
			for (int j = i+1; j < infos.size(); j++) {
				String[] a = infos.get(i);
				String[] b = infos.get(j);
				
			}
		}
		return null;
	}
	
	@Test
	public void test2(){
		String[] user1 = new String[]{"艺术","人文","清新","怀古"};
		String[] user2 = new String[]{"摄影","艺术","人文","清新","怀古"};
		List<String> favorites =new ArrayList<String>();
		for (int i = 0; i < user2.length; i++){
			   for (int j = 0; j < user1.length; j++){
			      if (user1[j].equals(user2[i])){
			    	  favorites.add(user1[j]);
			          }
			    }
			 }
		double similary = (double)favorites.size()/((double)user1.length+(double)user2.length-(double)favorites.size());
	}
}
