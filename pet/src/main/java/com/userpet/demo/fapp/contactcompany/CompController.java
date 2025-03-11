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
	
	@RequestMapping(value="/compcontact/compXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("comp", compService.selectList());
		return "compcontact/compXdmList";
	}
	
	@RequestMapping(value="/compcontact/compXdmView")
	public String codeGroupXdmView(Model model, CompDto compDto) {
		model.addAttribute("item", compService.selectOne(compDto));
		return "compcontact/compXdmView";
	}
	
	@RequestMapping(value="/compcontact/compXdmForm")
	public String codeGroupXdmForm() {
		return "compcontact/compXdmForm";
	}
	
	@RequestMapping(value="/compcontact/compXdmInst")
	public String codeGroupXdmInst(CompDto compDto) {
		compService.insert(compDto);
		return "redirect:/compcontact/compXdmList";
	}
	
	@RequestMapping(value="/compcontact/compXdmMfom")
	public String codeGroupXdmMfom(Model model, CompDto compDto) {
		model.addAttribute("item", compService.selectOne(compDto));
		return "compcontact/compXdmMfom";
	}
	
	@RequestMapping(value="/compcontact/compXdmUpdate")
	public String codeGroupXdmUpdate(CompDto compDto) {
		compService.update(compDto);
		System.out.println(compDto.getContactAdd_contSeq());
		return "redirect:/compcontact/compXdmList";
	}
	
	@RequestMapping(value="/compcontact/compXdmDelete")
	public String codeGroupXdmDelete(CompDto compDto) {
		compService.delete(compDto);
		return "redirect:/compcontact/compXdmList";
	}
	
	@RequestMapping(value="/compcontact/compXdmDeleNy")
	public String codeGroupXdmDeleNy(CompDto compDto) {
		compService.deleNy(compDto);
		return "redirect:/compcontact/compXdmList";
	}
}
