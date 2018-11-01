package jp.co.sample.hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ホテル検索の入力値を受け取るコントローラー.
 * 
 * @author yuta.ikeda
 *
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelRepository repository;
	
	/**
	 * 検索画面を表示する
	 * 
	 * @return　検索画面
	 */
	@RequestMapping("/view")
	public String viewHotel() {
		return "hoteldisplay/show";
	}
	
	/**
	 * 検索結果を表示.
	 * 
	 * @param price　リクエストパラメーターprice.　
	 * @return　検索画面.
	 */
	@RequestMapping("/findByPrice")
	private String findByPrice(Integer price,Model model) {
		
		
		
		List<Hotel> hotelList = repository.findByPrice(price);
		model.addAttribute("hotelList",hotelList);
		return "hoteldisplay/show";
	}
	
	

}
