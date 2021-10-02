package com.example.demo.entity.astro;

import java.util.Arrays;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

@Entity
public class astro {

	@Id
	private int id;
	private String urlSlug;
	private String namePrefix;
	private String firstName;
	private String lastName;
	private String aboutMe;
	private String profliePicUrl;
	private String experience;
	private String languages[];
	private int minimumCallDuration;
	private int minimumCallDurationCharges;
	private int additionalPerMinuteCharges;
	private boolean isAvailable;
	private String rating;
	private String skills[];
	private boolean isOnCall;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "imageid" , referencedColumnName = "id" )
	private Image images;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "availabilityid" , referencedColumnName = "id" )
	private Availability availability;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrlSlug() {
		return urlSlug;
	}
	public void setUrlSlug(String urlSlug) {
		this.urlSlug = urlSlug;
	}
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
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
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getProfliePicUrl() {
		return profliePicUrl;
	}
	public void setProfliePicUrl(String profliePicUrl) {
		this.profliePicUrl = profliePicUrl;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getMinimumCallDuration() {
		return minimumCallDuration;
	}
	public void setMinimumCallDuration(int minimumCallDuration) {
		this.minimumCallDuration = minimumCallDuration;
	}
	public int getMinimumCallDurationCharges() {
		return minimumCallDurationCharges;
	}
	public void setMinimumCallDurationCharges(int minimumCallDurationCharges) {
		this.minimumCallDurationCharges = minimumCallDurationCharges;
	}
	public int getAdditionalPerMinuteCharges() {
		return additionalPerMinuteCharges;
	}
	public void setAdditionalPerMinuteCharges(int additionalPerMinuteCharges) {
		this.additionalPerMinuteCharges = additionalPerMinuteCharges;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public boolean isOnCall() {
		return isOnCall;
	}
	public void setOnCall(boolean isOnCall) {
		this.isOnCall = isOnCall;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public Availability getAvailability() {
		return availability;
	}
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	public Image getImages() {
		return images;
	}
	public void setImages(Image images) {
		this.images = images;
	}
	public astro(int id, String urlSlug, String namePrefix, String firstName, String lastName, String aboutMe,
			String profliePicUrl, String experience, String[] languages, int minimumCallDuration,
			int minimumCallDurationCharges, int additionalPerMinuteCharges, boolean isAvailable, String rating,
			String[] skills, boolean isOnCall, Image images, Availability availability) {
		super();
		this.id = id;
		this.urlSlug = urlSlug;
		this.namePrefix = namePrefix;
		this.firstName = firstName;
		this.lastName = lastName;
		this.aboutMe = aboutMe;
		this.profliePicUrl = profliePicUrl;
		this.experience = experience;
		this.languages = languages;
		this.minimumCallDuration = minimumCallDuration;
		this.minimumCallDurationCharges = minimumCallDurationCharges;
		this.additionalPerMinuteCharges = additionalPerMinuteCharges;
		this.isAvailable = isAvailable;
		this.rating = rating;
		this.skills = skills;
		this.isOnCall = isOnCall;
		this.images = images;
		this.availability = availability;
	}
	public astro() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "astro [id=" + id + ", urlSlug=" + urlSlug + ", namePrefix=" + namePrefix + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", aboutMe=" + aboutMe + ", profliePicUrl=" + profliePicUrl
				+ ", experience=" + experience + ", languages=" + Arrays.toString(languages) + ", minimumCallDuration="
				+ minimumCallDuration + ", minimumCallDurationCharges=" + minimumCallDurationCharges
				+ ", additionalPerMinuteCharges=" + additionalPerMinuteCharges + ", isAvailable=" + isAvailable
				+ ", rating=" + rating + ", skills=" + Arrays.toString(skills) + ", isOnCall=" + isOnCall + ", images="
				+ images + ", availability=" + availability + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
