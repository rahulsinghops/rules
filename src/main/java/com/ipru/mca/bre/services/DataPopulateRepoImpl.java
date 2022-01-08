package com.ipru.mca.bre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ipru.mca.bre.dao.DataPopulateRepo;
import com.ipru.mca.bre.model.BreInputDetails;
@Service
public class DataPopulateRepoImpl implements DataPopulateRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static String sqlArray[] = {
			"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'Y','HIGHWAY','HILL','CRUISE',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'Y','STREET','HILL','NAKED',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'N','HIGHWAY','HILL','CRUISE',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'N','STREET','HILL','SPORTS',100000,150000)"

			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'Y','HIGHWAY','HILL','ECONOMY',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'Y','STREET','HILL','ECONOMY',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'N','HIGHWAY','HILL','SCOOTER',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'N','STREET','HILL','SCOOTER',100000,150000)"

			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'Y','HIGHWAY','SEA','CRUISE',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'Y','STREET','SEA','NAKED',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'N','HIGHWAY','SEA','SPORTS',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (20,30,'N','STREET','SEA','SCOOTER',100000,150000)"

			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'Y','HIGHWAY','SEA','ECONOMY',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'Y','STREET','SEA','ECONOMY',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'N','HIGHWAY','SEA','SCOOTER',100000,150000)"
			,"Insert into tbl_bre_details(MINAGE,MAXAGE,OFF_ROAD_FLAG,ROAD,SEAORHILL,TYPE,LOWER_RANGE,UPPER_RANGE) values (30,60,'N','STREET','SEA','SCOOTER',100000,150000)"
	};
	

	
	@Override
	public void populate(List<BreInputDetails> breInput) {
		jdbcTemplate.batchUpdate(sqlArray);

	}

}
