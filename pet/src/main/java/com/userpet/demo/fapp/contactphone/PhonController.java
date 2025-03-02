package com.userpet.demo.fapp.contactphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhonController {

	@Autowired
	PhonService phonService;
	
	@RequestMapping(value = "/addcontact/phonXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("phon", phonService.selectList());
		return "addcontact/phonXdmList";
	}
}
