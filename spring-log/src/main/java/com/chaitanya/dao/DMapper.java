package com.chaitanya.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chaitanya.domain.DLog;

import scala.annotation.meta.setter;

public class DMapper implements RowMapper<DLog>{

	@Override
	public DLog mapRow(ResultSet resultSet, int arg1) throws SQLException {

DLog dLog = new DLog();

dLog.setActionNm(resultSet.getString(2));
dLog.setDate(resultSet.getDate(5));
dLog.setDescription(resultSet.getString(3));
dLog.setId(resultSet.getInt(0));
dLog.setStatusNm(resultSet.getString(6));
dLog.setTicketId(resultSet.getInt(1));
dLog.setUpdatedBy(resultSet.getString(4));


		return dLog;
	}

}
