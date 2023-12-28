package in.ashokit.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	Logger logger=LoggerFactory.getLogger(DemoRestController.class);
	@GetMapping("/welcome")
	public String GetWelcomeMesaage() {
		
		logger.info("GetWelcomeMeesage execution started");
		String msg="welcome to ashok it";
		try {
			int i=10/0;
		}catch(Exception e) {
			logger.error("Exception occured"+ e.getMessage());
		}
		logger.info("GetWelcomeMeesage execution ended");
		return msg;
	}

}
