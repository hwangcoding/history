package hist.history.index.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index 컨트롤러를 정의
 * @author 황규빈
 * @since 2018.05.31
 *
 */
@Controller
public class IndexContoroller {

	@RequestMapping(value="/main.do")
	public String main(){
		return "hist/main/main";
	}

	@RequestMapping(value="/top.do")
	public String top(){
		return "hist/layout/top";
	}

	@RequestMapping(value="/side.do")
	public String side(){
		return "hist/layout/side";
	}

	@RequestMapping(value="/bottom.do")
	public String bottom(){
		return "hist/layout/bottom";
	}

}
