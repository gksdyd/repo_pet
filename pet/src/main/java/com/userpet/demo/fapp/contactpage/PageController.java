package com.userpet.demo.fapp.contactpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@Autowired
	PageService pageService;
	
	@RequestMapping(value = "/addcontact/pageXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("page", pageService.selectList());
		return "addcontact/pageXdmList";
	}
}
