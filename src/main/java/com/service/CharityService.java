package com.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.model.Sponsor;

//use appropriate annotation to configure CharityService as a Service
@Service
public class CharityService {
	private ArrayList<Sponsor> fundList = new ArrayList<Sponsor>();

	// add sponsor object into the fundList
	public boolean addFundDetails(Sponsor sponsor) {
		// Fill the code
		fundList.add(sponsor);
		return true;

	}

	public ArrayList<Sponsor> viewFundList() {
		// Fill the code
		return fundList;
	}

	public ArrayList<Sponsor> getFundList() {
		return fundList;
	}

	public void setFundList(ArrayList<Sponsor> fundList) {
		this.fundList = fundList;
	}

}
