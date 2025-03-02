package com.userpet.demo.fapp.groupname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrouController {

	@Autowired
	GrouService grouService;
	
	@RequestMapping(value = "/addcontact/grouXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("grou", grouService.selectList());
		return "addcontact/grouXdmList";
	}
}
