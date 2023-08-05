package com.ct.ordersystem.service;

import java.util.List;

import com.ct.ordersystem.dto.MenuRequestBody;
import com.ct.ordersystem.entity.MenuEntity;

public interface MenuService {
	
	void addMenu(MenuEntity menu);
	
	List<MenuEntity> findAllMenu();

	void deleteMenu(Integer menuId);
	
	MenuEntity updateMenu(MenuRequestBody menuRequestBody);
	
	Object findMenuById(Integer menuId);
}
