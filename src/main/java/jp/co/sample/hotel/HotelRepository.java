package jp.co.sample.hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 * hotelsと連携させるリポジトリ.
 * 
 * @author yuta.ikeda
 *
 */
@Repository
public class HotelRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;
	private static final RowMapper<Hotel> HOTEL_ROW_MAPPER = (rs, i) -> {

		Hotel hotel = new Hotel();
		hotel.setId(rs.getInt("id"));
		hotel.setAreaName(rs.getString("area_name"));
		hotel.setHotelName(rs.getString("hotel_name"));
		hotel.setAddress(rs.getString("address"));
		hotel.setNearestStation(rs.getString("nearest_station"));
		hotel.setPrice(rs.getInt("price"));
		hotel.setPrking(rs.getString("parking"));

		return hotel;

	};

	/**
	 * 全件検索
	 */
	public List<Hotel> findAll() {
		String sql = "SELECT id, area_name, hotel_name, address, nearest_station, price, parking from hotels;";
		List<Hotel> hotelList = template.query(sql, HOTEL_ROW_MAPPER);
		return hotelList;
	}
	
	
	/**
	 * 
	 * 
	 * @param price 値段
	 * @return
	 */
	public List<Hotel> findByPrice(Integer price) {
		String sql = "SELECT id, area_name, hotel_name, address, nearest_station, price, parking from hotels where price <= :price;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("price",price);
		List<Hotel> hotel = template.query(sql, param,HOTEL_ROW_MAPPER );
		return hotel;
	}
}

