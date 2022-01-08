package com.ipru.mca.bre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bre_details")
public class BreDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "b_id")
	private long bid;
	private String type;
	private int minage;
	private int maxage;
	private long lowerRange;
	private long upperRange;
	private String road;
	private String offRoadFlag;
	private String seaorhill;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getOffRoadFlag() {
		return offRoadFlag;
	}
	public void setOffRoadFlag(String offRoadFlag) {
		this.offRoadFlag = offRoadFlag;
	}
	public String getSeaorhill() {
		return seaorhill;
	}
	public void setSeaorhill(String seaorhill) {
		this.seaorhill = seaorhill;
	}

	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public int getMinage() {
		return minage;
	}
	public void setMinage(int minage) {
		this.minage = minage;
	}
	public int getMaxage() {
		return maxage;
	}
	public void setMaxage(int maxage) {
		this.maxage = maxage;
	}
	public long getLowerRange() {
		return lowerRange;
	}
	public void setLowerRange(long lowerRange) {
		this.lowerRange = lowerRange;
	}
	public long getUpperRange() {
		return upperRange;
	}
	public void setUpperRange(long upperRange) {
		this.upperRange = upperRange;
	}
	public BreDetails() {
		super();
	}
	public BreDetails(String type, int minage, int maxage, long lowerRange, long upperRange, String road,
			String offRoadFlag, String seaorhill) {
		super();
		this.type = type;
		this.minage = minage;
		this.maxage = maxage;
		this.lowerRange = lowerRange;
		this.upperRange = upperRange;
		this.road = road;
		this.offRoadFlag = offRoadFlag;
		this.seaorhill = seaorhill;
	}
	@Override
	public String toString() {
		return "BreDetails [bid=" + bid + ", type=" + type + ", minage=" + minage + ", maxage=" + maxage
				+ ", lowerRange=" + lowerRange + ", upperRange=" + upperRange + ", road=" + road + ", offRoadFlag="
				+ offRoadFlag + ", seaorhill=" + seaorhill + "]";
	}
	
	

}
