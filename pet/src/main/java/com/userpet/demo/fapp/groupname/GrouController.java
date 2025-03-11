package com.userpet.demo.fapp.groupname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrouController {

	@Autowired
	GrouService grouService;
	
	@RequestMapping(value = "/groucontact/grouXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("grou", grouService.selectList());
		return "groucontact/grouXdmList";
	}
	
	@RequestMapping(value = "/groucontact/grouXdmView")
	public String codeGroupXdmView(Model model, GrouDto grouDto) {
		model.addAttribute("item", grouService.selectOne(grouDto));
		return "groucontact/grouXdmView";
	}
	
	@RequestMapping(value = "/groucontact/grouXdmForm")
	public String codeGroupXdmForm() {
		return "groucontact/grouXdmForm";
	}
	
	@RequestMapping(value = "/groucontact/grouXdmInst")
	public String codeGroupXdmInst(GrouDto grouDto) {
		grouService.insert(grouDto);
		return "redirect:/groucontact/grouXdmList";
	}
	
	@RequestMapping(value = "/groucontact/grouXdmMfom")
	public String codeGroupXdmMfom(Model model, GrouDto grouDto) {
		model.addAttribute("item", grouService.selectOne(grouDto));
		return "groucontact/grouXdmMfom";
	}
	
	@RequestMapping(value = "/groucontact/grouXdmUpdate")
	public String codeGroupXdmUpdate(GrouDto grouDto) {
		grouService.update(grouDto);
		return "redirect:/groucontact/grouXdmList";
	}
	
	@RequestMapping(value = "/groucontact/grouXdmDelete")
	public String codeGroupXdmDelete(GrouDto grouDto) {
		grouService.delete(grouDto);
		return "redirect:/groucontact/grouXdmList";
	}
	
	@RequestMapping(value = "/groucontact/grouXdmDeleNy")
	public String codeGroupXdmDeleNy(GrouDto grouDto) {
		grouService.deleNy(grouDto);
		return "redirect:/groucontact/grouXdmList";
	}
}
