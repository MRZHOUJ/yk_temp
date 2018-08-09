package com.itheima.dao;

import java.util.List;

import com.itheima.pojo.Items;
import com.itheima.pojo.QueryVo;

public interface ItemsDao {
	public List<Items> findItemsByQueryVo(QueryVo queryVo);
}
