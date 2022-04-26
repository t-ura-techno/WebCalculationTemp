package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	//パスなしのメソッドをデフォルト用として残しておく
	@RequestMapping()
	public String defaultIndex() {
		return "index";
	}
	
	//res.htmlからindex.htmlに戻るために追加
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("calc")
	public String calc() {
		return "calc";
	}
}