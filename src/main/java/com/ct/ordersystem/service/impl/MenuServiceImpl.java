package com.ct.ordersystem.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.ordersystem.common.utils.CommonUtils;
import com.ct.ordersystem.dto.MenuRequestBody;
import com.ct.ordersystem.entity.Menu;
import com.ct.ordersystem.repository.MenuRepository;
import com.ct.ordersystem.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuRepository menuRepo;

	@Override
	public void addMenu(Menu menu) {

		menuRepo.save(menu);
	}

	@Override
	public List<Menu> findAllMenu() {

		return menuRepo.findAll();

	}

	@Override
	public void deleteMenu(int menuId) {
		menuRepo.deleteById(menuId);
	}

	@Override
	public Menu updateMenu(MenuRequestBody menuRequestBody) {

		Optional<Menu> menuTmp = menuRepo.findById(menuRequestBody.getMenuId());
		CommonUtils commonUtils = new CommonUtils();
		commonUtils.copyNonNullProperties(menuRequestBody, menuTmp.get());
		menuRepo.save(menuTmp.get());

		return menuTmp.get();
	}

	@Override
	public Object findMenuById(int menuId) {
		return menuRepo.findById(menuId);
	}

}
