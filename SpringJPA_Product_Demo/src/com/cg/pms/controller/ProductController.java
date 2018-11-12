package com.cg.pms.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.pms.model.Product;
import com.cg.pms.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService service;
	
	@RequestMapping("/home")
	public String showproductDetailsPage(Model model) {
		String view = "productDetails";
		List<String> list = new ArrayList<>();
		list.add("Hyderabad");
		list.add("Chennai");
		list.add("Pune");
		list.add("Mumbai");
		list.add("Bangalore");

		model.addAttribute("product", new Product());
		model.addAttribute("cities", list);
		return view;
	}

	@RequestMapping(value = "/registerProduct", method = RequestMethod.POST)
	public String registerProduct(Model model, @ModelAttribute("product") Product product) {

		String view = "success";
		service.registerProduct(product);
		model.addAttribute("msg", "product inserted..");
		return view;
	}
}
