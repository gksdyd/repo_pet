package com.userpet.demo.fapp.contactmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {

	@Autowired
	MailService mailService;
	
	@RequestMapping(value = "/addcontact/mailXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("mail", mailService.selectList());
		return "addcontact/mailXdmList";
	}
}
