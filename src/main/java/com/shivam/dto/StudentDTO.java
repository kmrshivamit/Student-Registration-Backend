package com.shivam.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.shivam.model.Course;
import com.shivam.model.Gender;
import com.shivam.model.Hobby;
import com.shivam.model.Qualification;

public class StudentDTO {
	
	long id;
	@NotNull(message="first Name must be not null")
	private String firstName;
	private String lastName;
	@NotNull(message = "message must be not null")
	@Email(message="email must be of proper type")
	private String emailId;
	@NotNull(message="mobile no must be not null")
	@Size(min = 10, max = 10, message = "Enter proper mobile number")
	private String MobileNumber;
	@NotNull(message="dob must be not null")
	private Date dateOfBirth;
	@NotNull(message = "address must be not null")
	private String address;
	@NotNull(message="city must be not null")
	private String city;
	@NotNull(message="pin must be not null")
	private String pinCode;
	@NotNull(message="state must be not null")
	private String state;
	@NotNull(message="country must be not null")
	private String country;
	private  List<Course> courses=new ArrayList<>();
	private  List<Qualification> qualifications=new ArrayList<>();
	private  List<Hobby> hobbies=new ArrayList<>();
	private  Gender gender;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public List<Qualification> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	public List<Hobby> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", MobileNumber=" + MobileNumber + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", city="
				+ city + ", pinCode=" + pinCode + ", state=" + state + ", country=" + country + ", courses=" + courses
				+ ", qualifications=" + qualifications + ", hobbies=" + hobbies + ", gender=" + gender + "]";
	}
	
	

}
