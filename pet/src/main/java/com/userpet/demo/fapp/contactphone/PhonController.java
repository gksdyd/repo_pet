package com.userpet.demo.fapp.contactphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhonController {

	@Autowired
	PhonService phonService;
	
	@RequestMapping(value = "/phoncontact/phonXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("phon", phonService.selectList());
		return "phoncontact/phonXdmList";
	}
	
	@RequestMapping(value = "/phoncontact/phonXdmView")
	public String codeGroupXdmView(Model model, PhonDto phonDto) {
		model.addAttribute("item", phonService.selectOne(phonDto));
		return "phoncontact/phonXdmView";
	}
	
	@RequestMapping(value = "/phoncontact/phonXdmForm")
	public String codeGroupXdmForm() {
		return "phoncontact/phonXdmForm";
	}
	
	@RequestMapping(value = "/phoncontact/phonXdmInst")
	public String codeGroupXdmInst(PhonDto phonDto) {
		phonService.insert(phonDto);
		return "redirect:/phoncontact/phonXdmList";
	}
	
	@RequestMapping(value = "/phoncontact/phonXdmMfom")
	public String codeGroupXdmMfom(Model model, PhonDto phonDto) {
		model.addAttribute("item", phonService.selectOne(phonDto));
		return "phoncontact/phonXdmMfom";
	}
	
	@RequestMapping(value = "/phoncontact/phonXdmUpdate")
	public String codeGroupXdmUpdate(PhonDto phonDto) {
		phonService.update(phonDto);
		return "redirect:/phoncontact/phonXdmList";
	}
}
