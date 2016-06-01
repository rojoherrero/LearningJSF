package org.rojoherrero.learnjsf.model.entities.mb1;

public class HealthPlan {

	private String name, contactPhone;
	private double monthlyPremium;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public double getMonthlyPremium() {
		return monthlyPremium;
	}

	public void setMonthlyPremium(double monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}

	public HealthPlan(String name, String contactPhone, double monthlyPremium) {
		super();
		this.name = name;
		this.contactPhone = contactPhone;
		this.monthlyPremium = monthlyPremium;
	}

}
