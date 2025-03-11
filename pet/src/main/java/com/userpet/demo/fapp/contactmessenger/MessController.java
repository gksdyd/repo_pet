package com.userpet.demo.fapp.contactmessenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessController {

	@Autowired
	MessService messService;
	
	@RequestMapping(value = "/messcontact/messXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("mess", messService.selectList());
		return "messcontact/messXdmList";
	}
	
	@RequestMapping(value = "/messcontact/messXdmView")
	public String codeGroupXdmView(Model model, MessDto messDto) {
		model.addAttribute("item", messService.selectOne(messDto));
		return "messcontact/messXdmView";
	}
	
	@RequestMapping(value = "/messcontact/messXdmForm")
	public String codeGroupXdmForm() {
		return "messcontact/messXdmForm";
	}
	
	@RequestMapping(value = "/messcontact/messXdmInst")
	public String codeGroupXdmInst(MessDto messDto) {
		messService.insert(messDto);
		return "redirect:/messcontact/messXdmList";
	}
	
	@RequestMapping(value = "/messcontact/messXdmMfom")
	public String codeGroupXdmMfom(Model model, MessDto messDto) {
		model.addAttribute("item", messService.selectOne(messDto));
		return "messcontact/messXdmMfom";
	}
	
	@RequestMapping(value = "/messcontact/messXdmUpdate")
	public String codeGroupXdmUpdate(MessDto messDto) {
		messService.update(messDto);
		return "redirect:/messcontact/messXdmList";
	}
	
	@RequestMapping(value = "/messcontact/messXdmDelete")
	public String codeGroupXdmDelete(MessDto messDto) {
		messService.delete(messDto);
		return "redirect:/messcontact/messXdmList";
	}
	@RequestMapping(value = "/messcontact/messXdmDeleNy")
	public String codeGroupXdmDeleNy(MessDto messDto) {
		messService.deleNy(messDto);
		return "redirect:/messcontact/messXdmList";
	}
}
