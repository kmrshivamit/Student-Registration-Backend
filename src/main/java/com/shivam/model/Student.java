package com.shivam.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String firstName;
	private String lastName;
	@NotNull
	@Email
	private String emailId;
	@NotNull
	@Size(min = 10, max = 10, message = "Enter proper mobile number")
	private String MobileNumber;
	@NotNull
	private Date dateOfBirth;
	@NotNull
	private String address;
	@NotNull
	private String city;
	@NotNull
	private String pinCode;
	@NotNull
	private String state;
	@NotNull
	private String country;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "student_courses", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = {
			@JoinColumn(name = "course_id") })
	@NotNull
	private List<Course> courses = new ArrayList<>();
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "student_qualification", joinColumns = {
			@JoinColumn(name = "student_id") }, inverseJoinColumns = { @JoinColumn(name = "qualification_id") })
	@NotNull
	private List<Qualification> qualifications = new ArrayList<>();
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "student_hobbies", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = {
			@JoinColumn(name = "hobby_id") })
	@NotNull
	private List<Hobby> hobbies = new ArrayList<>();
	@NotNull
	private Gender gender;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String firstName, String lastName, String emailId, String mobileNumber, Date dateOfBirth,
			String address, String city, String pinCode, String state, String country, List<Course> courses,
			List<Qualification> qualifications, List<Hobby> hobbies, Gender gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		MobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
		this.courses = courses;
		this.qualifications = qualifications;
		this.hobbies = hobbies;
		this.gender = gender;
	}

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
