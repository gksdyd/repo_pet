package com.userpet.demo.fapp.contactanniversary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnniController {

	@Autowired
	AnniService anniService;
	
//	@RequestMapping(value="/addcontact/anniXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<AnniDto> anniDtos = new ArrayList<>();
//		anniDtos = anniService.selectList();
//		
//		model.addAttribute("anni", anniService.selectList());
//		
//		return "addcontact/anniXdmList";
//	}
	
	@RequestMapping(value="/annicontact/anniXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("anni", anniService.selectList());
		return "annicontact/anniXdmList";
	}
	
	@RequestMapping(value="/annicontact/anniXdmView")
	public String codeGroupXdmView(Model model, AnniDto anniDto) {
		model.addAttribute("item", anniService.selectOne(anniDto));
		return "annicontact/anniXdmView";
	}
	
	@RequestMapping(value="/annicontact/anniXdmForm")
	public String codeGroupXdmForm() {
		return "annicontact/anniXdmForm";
	}
	
	@RequestMapping(value="/annicontact/anniXdmInst")
	public String codeGroupXdmInst(AnniDto anniDto) {
		System.out.println(anniDto.getContactAdd_contSeq());
		anniService.insert(anniDto);
		return "redirect:/annicontact/anniXdmList";
	}
	
	@RequestMapping(value="/annicontact/anniXdmMfom")
	public String codeGroupXdmMfom(Model model, AnniDto anniDto) {
		model.addAttribute("item", anniService.selectOne(anniDto));
		return "annicontact/anniXdmMfom";
	}
	
	@RequestMapping(value="/annicontact/anniXdmUpdate")
	public String codeGroupXdmUpdate(AnniDto anniDto) {
		anniService.update(anniDto);
		return "redirect:/annicontact/anniXdmList";
	}
	
	@RequestMapping(value="/annicontact/anniXdmDelete")
	public String codeGroupXdmDelete(AnniDto anniDto) {
		anniService.delete(anniDto);
		return "redirect:/annicontact/anniXdmList";
	}
	
	@RequestMapping(value="/annicontact/anniXdmDeleNy")
	public String codeGroupXdmDeleNy(AnniDto anniDto) {
		anniService.deleNy(anniDto);
		return "redirect:/annicontact/anniXdmList";
	}
}
