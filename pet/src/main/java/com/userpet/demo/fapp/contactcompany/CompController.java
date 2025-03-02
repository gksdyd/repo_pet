package com.userpet.demo.fapp.contactcompany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompController {

	@Autowired
	CompService compService;
	
	@RequestMapping(value="/addcontact/compXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("comp", compService.selectList());
		return "addcontact/compXdmList";
	}
}
