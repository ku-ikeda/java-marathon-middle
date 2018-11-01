package jp.co.sample.baseball;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 入力した値を受けとるコントローラー.
 * 
 * @author yuta.ikeda
 *
 */
@Controller
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamRepository repository;

	/**
	 * 
	 * 
	 * @param 全件検索結果を受け取る.
	 * @return　入力画面へフォワード.
	 */
	@RequestMapping("/index1")
	private String index1(Model model) {
	

		List<Team> teamList = repository.findAll();
		model.addAttribute("teamList", teamList);

		return "baseballteam/select";
	}

	/**
	 * @param 
	 * @param 主キー検索の結果を受け取る.
	 * @return　球団選択画面で選んだ先の情報を表示する情報.
	 */
	@RequestMapping("/view")
	private String view(Integer id,Model model) {
		Team team = repository.load(id);
		model.addAttribute("team",team);
		return "baseballteam/view";
	}
	
	/*
	@RequestMapping("/index2")
	private String index2(Model model,Integer id) {
		
		Team team = repository.load(id);
		model.addAttribute("team",team);
		
		return "baseballteam/view";
	}
*/
}