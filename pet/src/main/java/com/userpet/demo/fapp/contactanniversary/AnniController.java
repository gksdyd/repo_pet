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
	
	@RequestMapping(value="/addcontact/anniXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("anni", anniService.selectList());
		return "addcontact/anniXdmList";
	}
}
