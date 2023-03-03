package task1;

public class City {
private long cityid;
public long getCityid() {
	return cityid;
}
public void setCityid(long cityid) {
	this.cityid = cityid;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
private String cityname;
public City(long cityid, String cityname) {
	super();
	this.cityid = cityid;
	this.cityname = cityname;
}

}
