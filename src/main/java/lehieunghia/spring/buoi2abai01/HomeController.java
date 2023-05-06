package lehieunghia.spring.buoi2abai01;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Index(){
        return "HomePage";
    }
    @GetMapping("/display")
    public String displayName(HttpServletRequest request){
        String name = request.getParameter("name");
        request.setAttribute("Name", name);
        return "DisplayInformation";
    }
}
