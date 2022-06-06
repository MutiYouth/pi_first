package com.weng.j4pi.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
// import com.pi4j.io.gpio.GpioController;
// import com.pi4j.io.gpio.GpioFactory;
// import com.pi4j.io.gpio.GpioPinDigitalOutput;
// import com.pi4j.io.gpio.PinState;
// import com.pi4j.io.gpio.RaspiPin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test_web_page")
public class TestWebPageController {

	// // create gpio controller instance
	// final GpioController gpio = GpioFactory.getInstance();
	// GpioPinDigitalOutput myLed = gpio.provisionDigitalOutputPin(
	// 		RaspiPin.GPIO_04,   // PIN NUMBER
	// 		"My LED",           // PIN FRIENDLY NAME (optional)
	// 		PinState.LOW);
	//
	// @RequestMapping("/open")
	// @ResponseBody
	// public String open() {
	// 	// PIN STARTUP STATE (optional)
	// 	myLed.setState(PinState.HIGH);
	// 	return "open";
	// }
	//
	// @RequestMapping("/close")
	// @ResponseBody
	// public String close() {
	// 	myLed.setState(PinState.LOW);
	// 	return "close";
	// }

	@RequestMapping(value = "/list2", method = RequestMethod.GET)
	private String list2(Model model) {
		return "redirect:/test_p/index_2.html"; // WEB-INF/jsp/"list".jsp
	}

	/**
	 * 返回
	 * REF
	 * https://www.cnblogs.com/guo-xu/p/11203740.html
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list3", method = RequestMethod.GET)
	private String list3(Model model) {
		return "redirect:/index.html"; // WEB-INF/jsp/"list".jsp
	}

}
