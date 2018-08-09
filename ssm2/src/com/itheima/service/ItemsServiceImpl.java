package com.itheima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.pojo.QueryVo;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsDao itemsDao;

	@Override
	public List<Items> findItemsByQueryVo(QueryVo queryVo) {
		return itemsDao.findItemsByQueryVo(queryVo);
	}
}
