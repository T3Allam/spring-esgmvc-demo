package com.tal.springdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tal.springdemo.dao.CompanyDAO;
import com.tal.springdemo.entity.Company;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	//Data Access Object
	@Autowired
	private CompanyDAO companyDAO;
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("company", new Company());		
		return "company-form";
	}
	
	@PostMapping("/saveCompany")
	public String saveCompany(@Valid @ModelAttribute("company") Company company, BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return "company-form";
		} else {
			companyDAO.saveCompany(company);
			return "redirect:/company/list";			
		}
	}
	
	@GetMapping("/list")
	public String listCompanies(Model theModel) {
		//get companies from the DAO
		List<Company> theCompanies = companyDAO.getCompanies();
		//add the companies to the model
		theModel.addAttribute("companies", theCompanies);
		return "list-companies";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);		
	}
}
