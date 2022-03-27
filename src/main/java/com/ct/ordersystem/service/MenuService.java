package com.ct.ordersystem.service;

import java.util.List;

import com.ct.ordersystem.dto.MenuRequestBody;
import com.ct.ordersystem.entity.Menu;

public interface MenuService {
	
	void addMenu(Menu menu);
	
	List<Menu> findAllMenu();

	void deleteMenu(int menuId);
	
	Menu updateMenu(MenuRequestBody menuRequestBody);
	
	Object findMenuById(int menuId);
}
