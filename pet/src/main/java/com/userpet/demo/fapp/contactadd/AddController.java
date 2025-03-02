package com.userpet.demo.fapp.contactadd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	@Autowired
	AddService addService;
	
//	@RequestMapping(value="/addcontact/addXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<AddDto> addDtos = new ArrayList<>();
//		addDtos = addService.selectList();
//		
//		model.addAttribute("list", addService.selectList());
//		
//		return "addcontact/addXdmList";
//	}
	
	@RequestMapping(value="/addcontact/addXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", addService.selectList());
		return "addcontact/addXdmList";
	}
}
