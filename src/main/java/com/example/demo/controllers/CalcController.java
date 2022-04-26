package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.CalcService;

@Controller
public class CalcController {

	@Autowired
	private CalcService service;

	// 足し算呼び出し
	@PostMapping("resAdd")
	public String resAdd
	(
		Model model,
		@RequestParam("addNumA") String numA,
		@RequestParam("addNumB") String numB
	) {

		model.addAttribute("kotae", service.calculateAdd(numA, numB));

		return "res";

	}

	// 引き算呼び出し
	@PostMapping("resSubtract")
	public String resSubtract
	(
		Model model,
		@RequestParam("subtractNumA") String numA,
		@RequestParam("subtractNumB") String numB
	) {

		model.addAttribute("kotae", service.calculateSubtract(numA, numB));

		return "res";

	}

	// かけ算呼び出し
	@PostMapping("resMultiply")
	public String resMultiply
	(
		Model model,
		@RequestParam("multiplyNumA") String numA,
		@RequestParam("multiplyNumB") String numB
	) {

		model.addAttribute("kotae", service.calculateMultiply(numA, numB));

		return "res";

	}

	// 割り算呼び出し
	@PostMapping("resDivide")
	public String resDivide
	(
		Model model,
		@RequestParam("divideNumA") String numA,
		@RequestParam("divideNumB") String numB
	) {

		model.addAttribute("kotae", service.calculateDivide(numA, numB));

		return "res";

	}

	// 余りの計算の呼び出し
	@PostMapping("resRemainder")
	public String resRemainder
	(
		Model model,
		@RequestParam("remainderNumA") String numA,
		@RequestParam("remainderNumB") String numB
	) {

		model.addAttribute("kotae", service.calculateRemainder(numA, numB));

		return "res";

	}

	// 累乗の計算の呼び出し
	@PostMapping("resPow")
	public String resPow
	(
		Model model,
		@RequestParam("powNumA") String numA,
		@RequestParam("powNumB") String numB
	) {

		model.addAttribute("kotae", service.calculatePow(numA, numB));

		return "res";

	}

}