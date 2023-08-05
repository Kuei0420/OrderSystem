package com.ct.ordersystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.ordersystem.dto.MenuRequestBody;
import com.ct.ordersystem.entity.MenuEntity;
import com.ct.ordersystem.service.MenuService;

@RestController
public class MenuController {

	private static Logger logger = LoggerFactory.getLogger(MenuController.class);

	@Autowired
	MenuService menuService;

//	@PostMapping(value = "/addMenu", produces = MediaType.APPLICATION_JSON_VALUE)
//	public MenuEntity addMenu(@RequestBody MenuEntity menu) {
//		menuService.addMenu(menu);
//
//		return menu;
//	}
//
//	@PostMapping(value = "/findAllMenu", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<MenuEntity> findAllMenu() {
//		return menuService.findAllMenu();
//		
//	}
	
	@PostMapping("/menu")
	@ResponseBody
    public List<MenuEntity> processMenuItems(Model model) {
        // 在這裡處理您的後端邏輯，對提交的餐點項目資料進行處理
		List<MenuEntity> menuItems = menuService.findAllMenu();
		logger.info("menuItems："+menuItems);
//		// 將餐點資料傳遞給前端視圖
//        model.addAttribute("menuItems", menuItems);
//        // 返回適當的視圖或重定向
        return menuItems;
    }
//
//	@PostMapping(value = "/findMenuById", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Object findMenuById(@RequestBody MenuRequestBody menuRequestBody) {
//		return menuService.findMenuById(menuRequestBody.getMenuId());
//	}
//
//	@PostMapping(value = "/updateMenu", produces = MediaType.APPLICATION_JSON_VALUE)
//	public MenuEntity updateMenu(@RequestBody MenuRequestBody menuRequestBody) {
//		return menuService.updateMenu(menuRequestBody);
//	}
//
//	@PostMapping(value = "/deleteMenu")
//	public String deleteMenu(@RequestBody MenuRequestBody menuRequestBody) {
//		menuService.deleteMenu(menuRequestBody.getMenuId());
//
//		return "Menu Delete!";
//	}

}
