package com.userpet.demo.fapp.contactpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@Autowired
	PageService pageService;
	
	@RequestMapping(value = "/pagecontact/pageXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("page", pageService.selectList());
		return "pagecontact/pageXdmList";
	}
	
	@RequestMapping(value = "/pagecontact/pageXdmView")
	public String codeGroupXdmView(Model model, PageDto pageDto) {
		model.addAttribute("item", pageService.selectOne(pageDto));
		return "pagecontact/pageXdmView";
	}
	
	@RequestMapping(value = "/pagecontact/pageXdmForm")
	public String codeGroupXdmForm() {
		return "pagecontact/pageXdmForm";
	}
	
	@RequestMapping(value = "/pagecontact/pageXdmInst")
	public String codeGroupXdmInst(PageDto pageDto) {
		pageService.insert(pageDto);
		return "redirect:/pagecontact/pageXdmList";
	}
	
	@RequestMapping(value = "/pagecontact/pageXdmMfom")
	public String codeGroupXdmMfom(Model model, PageDto pageDto) {
		model.addAttribute("item", pageService.selectOne(pageDto));
		return "pagecontact/pageXdmMfom";
	}
	
	@RequestMapping(value = "/pagecontact/pageXdmUpdate")
	public String codeGroupXdmUpdate(PageDto pageDto) {
		pageService.update(pageDto);
		return "redirect:/pagecontact/pageXdmList";
	}
}
