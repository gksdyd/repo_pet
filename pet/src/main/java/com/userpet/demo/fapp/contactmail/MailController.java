package com.userpet.demo.fapp.contactmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {

	@Autowired
	MailService mailService;
	
	@RequestMapping(value = "/mailcontact/mailXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("mail", mailService.selectList());
		return "mailcontact/mailXdmList";
	}
	
	@RequestMapping(value = "/mailcontact/mailXdmView")
	public String codeGroupXdmView(Model model, MailDto mailDto) {
		model.addAttribute("item", mailService.selectOne(mailDto));
		return "mailcontact/mailXdmView";
	}
	
	@RequestMapping(value = "/mailcontact/mailXdmForm")
	public String codeGroupXdmForm() {
		return "mailcontact/mailXdmForm";
	}
	
	@RequestMapping(value = "/mailcontact/mailXdmInst")
	public String codeGroupXdmInst(MailDto mailDto) {
		mailService.insert(mailDto);
		return "redirect:/mailcontact/mailXdmList";
	}
	
	@RequestMapping(value = "/mailcontact/mailXdmMfom")
	public String codeGroupXdmMfom(Model model, MailDto mailDto) {
		model.addAttribute("item", mailService.selectOne(mailDto));
		return "mailcontact/mailXdmMfom";
	}
	
	@RequestMapping(value = "/mailcontact/mailXdmUpdate")
	public String codeGroupXdmUpdate(MailDto mailDto) {
		mailService.update(mailDto);
		return "redirect:/mailcontact/mailXdmList";
	}
	
	@RequestMapping(value = "/mailcontact/mailXdmDelete")
	public String codeGroupXdmDelete(MailDto mailDto) {
		mailService.delete(mailDto);
		return "redirect:/mailcontact/mailXdmList";
	}
	
	@RequestMapping(value = "/mailcontact/mailXdmDeleNy")
	public String codeGroupXdmDeleNy(MailDto mailDto) {
		mailService.deleNy(mailDto);
		return "redirect:/mailcontact/mailXdmList";
	}
}
