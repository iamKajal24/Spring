package springmvcsearch;


import java.sql.Date;
import java.util.List;

public class Student {

	private String name;
	private Long id;
//	private Date date;
	private List<String> course;
	private String gender;
	private String type;

    private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}

	
	
}
