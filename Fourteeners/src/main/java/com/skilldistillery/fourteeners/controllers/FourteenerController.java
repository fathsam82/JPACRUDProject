package com.skilldistillery.fourteeners.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.fourteeners.data.FourteenerDAO;
import com.skilldistillery.fourteeners.entities.Fourteener;

@Controller
public class FourteenerController {

	@Autowired
	private FourteenerDAO fourteenerDao;

	@RequestMapping(path = { "/", "home.do" })
	public String goHome(Model model) {
		model.addAttribute("fourteenerList", fourteenerDao.findAll());
		return "home";
	}

	@RequestMapping(path = "getFourteener.do", method = RequestMethod.GET)
	public String displayFourteener(Model model, @RequestParam int id) {
		Fourteener fourteener = fourteenerDao.findById(id);
		model.addAttribute("fourteener", fourteener);
		return "fourteener/show";
	}

	@RequestMapping(path = "updateFourteener.do", method = RequestMethod.POST)
	public String updateFourteener(Model model, @RequestParam int id, Fourteener updatedFourteener) {
		Fourteener existingFourteener = fourteenerDao.findById(id);

		return "fourteener/edit";
	}

	@RequestMapping(path = "createFourteener.do", method = RequestMethod.POST)
	public String createFourteener(Model model, @ModelAttribute("fourteener") Fourteener fourteener) {
		Fourteener createdFourteener = fourteenerDao.create(fourteener);
		model.addAttribute("fourteener", createdFourteener);
		return "fourteener/createFourteener";
	}

	@RequestMapping(path = "getCreateFourteener.do")
	public String getCreateFourteener() {

		return "fourteener/createFourteener";
	}
	
	@RequestMapping(path = "deleteFourteener.do")
	public String deleteFourteener(@RequestParam("fourteenerId") int fourteenerId) {
		
		boolean deleteFourteener = fourteenerDao.deleteById(fourteenerId);
		
		
		if (deleteFourteener) {
			return"fourteener/show";
		
		
		}
		else{
			return "error";
		}

	}

}