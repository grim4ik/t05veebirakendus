package kirikotk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
@SpringBootApplication
public class Rakendus{
	
	@Autowired
	private TelefoninimikiriTab telefoninimikiriTab;
	
	
	@RequestMapping("/helo")
	String tervitusfunktsioon(){
		return "hello!";
	}
	
	@RequestMapping("/telefonid")
	public String telefonid(){
		String str = "Telefonid:</br>";
		for (telefoninimekiri telefoninimekiri: telefoninimikiriTab.findAll()){
		str = str + telefoninimekiri.title + " " + telefoninimekiri.year + " " + telefoninimekiri.cost;
		str += "</br>";
		}
		return str;
	}
	
    @RequestMapping("/lisa")
    String lisa(String title, Integer year, Integer cost) {
        telefoninimekiri telefoninimekiri = new telefoninimekiri();
        telefoninimekiri.title = title;
        telefoninimekiri.year = year;
		telefoninimekiri.cost = cost;
        telefoninimikiriTab.save(telefoninimekiri);
        return "Lisatud " + title + year + cost;
    }
	/*
	http://localhost:5246/lisa?title=TheSims3&year=2013&cost=30
	*/
	
    public static void main(String[] args) {
        System.getProperties().put("server.port", 2456);
        SpringApplication.run(Rakendus.class, args);
	}
	
}

