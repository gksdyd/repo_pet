package com.userpet.demo.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/index2")
	public String index2() {
		return "abc/index2";
	}
	
	@RequestMapping(value = "/helloWorld")
	public String hello() {
		return "helloWorld";
	}
	
	@RequestMapping(value = "/aaa/bbb")
	public String test1() {
		return "bbb/aaa";
	}
	@RequestMapping(value = "/xxx/yyy/zzz")
	public String test2() {
		return "yyy/zzz";
	}
	
	@RequestMapping(value = "/ttt/yyy")
	public String test3() {
		return "zzz/yyy/xxx";
	}
	
	@RequestMapping(value = "/infra/member/loginXdmForm")
	public String loginXdmForm() {
		return "adm/v1/tmpname/infra/member/loginForm";
	}
	
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupList";
	}
	
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupForm";
	}
	
	@RequestMapping(value = "/infra/member/loginUsrForm")
	public String loginUsrForm() {
		return "usr/v1/tmpname/infra/member/loginForm";
	}
}
