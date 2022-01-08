package com.ipru.mca.bre.dao;

import java.util.List;

import com.ipru.mca.bre.model.BreInputDetails;

public interface DataPopulateRepo {
	public void populate(List<BreInputDetails> breInput);

}
