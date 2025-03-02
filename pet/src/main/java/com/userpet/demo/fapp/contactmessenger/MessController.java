package com.userpet.demo.fapp.contactmessenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessController {

	@Autowired
	MessService messService;
	
	@RequestMapping(value = "/addcontact/messXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("mess", messService.selectList());
		return "addcontact/messXdmList";
	}
}
