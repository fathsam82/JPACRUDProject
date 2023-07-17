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
	    if (fourteener == null) {
//	        model.addAttribute("message", "Fourteener out of reach!");
	        return "fourteener/error"; 
	    }
	    model.addAttribute("fourteener", fourteener);
	    return "fourteener/show";
	}

	@RequestMapping(path = "createFourteener.do", method = RequestMethod.POST)
	public String createFourteener(Model model, @ModelAttribute("fourteener") Fourteener fourteener) {
		Fourteener createdFourteener = fourteenerDao.create(fourteener);
		model.addAttribute("fourteener", createdFourteener);
		return "home";
	}

	@RequestMapping(path = "getCreateFourteener.do")
	public String getCreateFourteener() {

		return "fourteener/createFourteener";
	}

	@RequestMapping(path = "deleteFourteener.do")
	public String deleteFourteener(@RequestParam("fourteenerId") int id) {

		boolean deleteFourteener = fourteenerDao.deleteById(id);

		if (deleteFourteener) {
			return "home";

		} else {
			return "error";
		}

	}

	@RequestMapping(path = "updateFourteener.do", method = RequestMethod.POST)
	public String updateFourteener(Model model, @RequestParam int id, Fourteener updatedFourteener) {
		Fourteener newlyCreated = fourteenerDao.update(id, updatedFourteener);
		model.addAttribute("newlyCreated", newlyCreated);

		return "home";
	}



}