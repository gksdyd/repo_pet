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
	
	@RequestMapping(value="/addcontact/addXdmView")
	public String codeGroupXdmView(Model model, AddDto addDto) {
		model.addAttribute("item", addService.selectOne(addDto));
		return "addcontact/addXdmView";
	}
	
	@RequestMapping(value="/addcontact/addXdmForm")
	public String codeGroupXdmForm() {
		return "addcontact/addXdmForm";
	}
	
	@RequestMapping(value="/addcontact/addXdmInst")
	public String codeGroupXdmInst(AddDto addDto) {
		System.out.println(addDto.getContSeq());
		addService.insert(addDto);
		System.out.println(addDto.getContSeq());
		return "redirect:/addcontact/addXdmList";
	}
	
	@RequestMapping(value="/addcontact/addXdmMfom")
	public String codeGroupXdmMfom(Model model, AddDto addDto) {
		model.addAttribute("item", addService.selectOne(addDto));
		return "addcontact/addXdmMfom";
	}
	
	@RequestMapping(value="/addcontact/addXdmUpdate")
	public String codeGroupXdmUpdate(AddDto addDto) {
		addService.update(addDto);
		System.out.println(addDto.getContSeq());
		return "redirect:/addcontact/addXdmList";
	}
	
	@RequestMapping(value="/addcontact/addXdmDelete")
	public String codeGroupXdmDelete(AddDto addDto) {
		addService.delete(addDto);
		return "redirect:/addcontact/addXdmList";
	}
	
	@RequestMapping(value="/addcontact/addXdmDeleNy")
	public String codeGroupXdmDeleNy(AddDto addDto) {
		addService.deleNy(addDto);
		return "redirect:/addcontact/addXdmList";
	}
}
