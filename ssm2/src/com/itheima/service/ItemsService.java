package com.itheima.service;

import java.util.List;

import com.itheima.pojo.Items;
import com.itheima.pojo.QueryVo;

public interface ItemsService {
	public List<Items> findItemsByQueryVo(QueryVo queryVo);
}
