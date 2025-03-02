package com.userpet.demo.fapp.contactaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddrController {

	@Autowired
	AddrService addrService;
	@RequestMapping(value="/addcontact/addrXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("addr", addrService.selectList());
		return "addcontact/addrXdmList";
	}
}
