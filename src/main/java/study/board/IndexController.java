package study.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/main")
    public String main(){
        return "/main";
    }

    @GetMapping("/sidebar")
    public String sidebar(){
        return "/sidebar";
    }

    @GetMapping("/write")
    public String write(){
        return "/write";
    }

    @GetMapping("/detail")
    public String detail(){
        return "/detail";
    }
}
