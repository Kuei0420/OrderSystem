package com.ct.ordersystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.ordersystem.dto.MenuRequestBody;
import com.ct.ordersystem.entity.Menu;
import com.ct.ordersystem.service.MenuService;

@RestController
public class MenuController {

	private static Logger logger = LoggerFactory.getLogger(MenuController.class);

	@Autowired
	MenuService menuService;

	@PostMapping(value = "/addMenu", produces = MediaType.APPLICATION_JSON_VALUE)
	public Menu addMenu(@RequestBody Menu menu) {
		menuService.addMenu(menu);

		return menu;
	}

	@PostMapping(value = "/findAllMenu", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Menu> findAllMenu() {
		return menuService.findAllMenu();
	}

	@PostMapping(value = "/findMenuById", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object findMenuById(@RequestBody MenuRequestBody menuRequestBody) {
		return menuService.findMenuById(menuRequestBody.getMenuId());
	}

	@PostMapping(value = "/updateMenu", produces = MediaType.APPLICATION_JSON_VALUE)
	public Menu updateMenu(@RequestBody MenuRequestBody menuRequestBody) {
		return menuService.updateMenu(menuRequestBody);
	}

	@PostMapping(value = "/deleteMenu")
	public String deleteMenu(@RequestBody MenuRequestBody menuRequestBody) {
		menuService.deleteMenu(menuRequestBody.getMenuId());

		return "Menu Delete!";
	}

}
