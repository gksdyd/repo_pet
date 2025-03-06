package com.userpet.demo.fapp.contactaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddrController {

	@Autowired
	AddrService addrService;
	
	@RequestMapping(value="/addrcontact/addrXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("addr", addrService.selectList());
		return "addrcontact/addrXdmList";
	}
	
	@RequestMapping(value="/addrcontact/addrXdmView")
	public String codeGroupXdmView(Model model, AddrDto addrDto) {
		model.addAttribute("item", addrService.selectOne(addrDto));
		return "addrcontact/addrXdmView";
	}
	
	@RequestMapping(value="/addrcontact/addrXdmForm")
	public String codeGroupXdmForm(AddrDto addrDto) {
		return "addrcontact/addrXdmForm";
	}
	
	@RequestMapping(value="/addrcontact/addrXdmInst")
	public String codeGroupXdmInst(AddrDto addrDto) {
		System.out.println(addrDto.getAddrMain());
		addrService.insert(addrDto);
		return "redirect:/addrcontact/addrXdmList";
	}
	
	@RequestMapping(value="/addrcontact/addrXdmMfom")
	public String codeGroupXdmMfom(AddrDto addrDto, Model model) {
		model.addAttribute("item", addrService.selectOne(addrDto));
		return "addrcontact/addrXdmMfom";
	}
	
	@RequestMapping(value="/addrcontact/addrXdmUpdate")
	public String codeGroupXdmUpdate(AddrDto addrDto) {
		addrService.update(addrDto);
		return "redirect:/addrcontact/addrXdmList";
	}
}
