package com.springapp.mvc;

import com.springapp.mvc.domein.Authorization;
import com.springapp.mvc.domein.Role;
import com.springapp.mvc.domein.User;
import com.springapp.mvc.service.IAuthorzationService;
import com.springapp.mvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private IAuthorzationService authorizationService;
	@Autowired
	private IUserService userService;


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(){
		//local
		/*User f_test = userService.getUserById(1);
		authorizationService.saveAuth(new Authorization("login1","2",1,f_test));
		authorizationService.saveAuth(new Authorization("login2","2",1,f_test));
*/
		User test2 = new User("test2","t2",2,"2");
		userService.save(test2);
		//authorizationService.saveAuth(new Authorization("login3","4",new Role(1, "admin"),test2));
		/*authorizationService.saveAuth(new Authorization("login4","4",1,test2));*/

		/*User test3 = new User("test3","t3",3,"3");

		authorizationService.saveAuth(new Authorization("login1","4",1,test3));
		test3.setId(100);
		userService.save(test3);*/

		/*User test4 = userService.getUserById(3);
		if (test4==null)
			System.out.println("null");
		else
			System.out.println(test4.getName());*/
		return "hello";
	}

	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String remove(){
		userService.deleteUser(userService.getUserById(3));
		return "hello";
	}
}