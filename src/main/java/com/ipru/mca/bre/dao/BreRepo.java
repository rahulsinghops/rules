package com.ipru.mca.bre.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ipru.mca.bre.model.BreDetails;
@Repository
public interface BreRepo extends JpaRepository<BreDetails, Long> {

	/*
	 * @Query("from BRE_DETAILS where OFF_ROAD_FLAG =?1 AND MINAGE > ?2") public
	 * BreDetails getDetailsByRoadFlag(String flag,int age);
	 */
	
	@Query(" from BreDetails where maxage >=?1 and minage<=?2 and offRoadFlag =?3 and road=?4 and seaorhill=?5")
	public BreDetails getBreDecision(int maxage,int minage,String offRoadFlag,String road,String seaOrHill);
}
