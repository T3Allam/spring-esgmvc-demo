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

import com.tal.springdemo.dao.DocumentDAO;
import com.tal.springdemo.entity.Document;

@Controller
@RequestMapping("/document")
public class DocumentController {
	
	//Data Access Object
	@Autowired
	private DocumentDAO documentDAO;
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("document", new Document());
		return "document-form";
	}
	
	@PostMapping("/saveDocument")
	public String processForm(@Valid @ModelAttribute Document document, BindingResult theBindigResult) {
		if (theBindigResult.hasErrors()) {
			return "document-form";
		} else {
			documentDAO.saveDocument(document);
			return "redirect:/document/list";			
		}
	}
	
	@GetMapping("/list")
	public String listDocuments(Model theModel) {
		//get companies from the DAO
		List<Document> theDocuments = documentDAO.getDocuments();
		//add the companies to the model
		theModel.addAttribute("documents", theDocuments);
		return "list-documents";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);		
	}
}
