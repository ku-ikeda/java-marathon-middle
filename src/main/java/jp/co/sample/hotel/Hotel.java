package jp.co.sample.hotel;

/**
 * 値を示すドメイン.
 * 
 * @author yuta.ikeda
 *
 */
public class Hotel {

	/** id */
	private Integer id;
	/** 地域名 */
	private String areaName;
	/** ホテル名 */
	private String hotelName;
	/** ホテル住所 */
	private String address;
	/** ホテルの最寄り駅 */
	private String nearestStation;
	/** 宿泊費用 */
	private Integer price;
	/** 駐車場 */
	private String prking;

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", areaName=" + areaName + ", hotelName=" + hotelName + ", address=" + address
				+ ", nearestStation=" + nearestStation + ", price=" + price + ", prking=" + prking + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNearestStation() {
		return nearestStation;
	}

	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPrking() {
		return prking;
	}

	public void setPrking(String prking) {
		this.prking = prking;
	}

}
