package com.netchus.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.netchus.domain.EnvironmentVO;
import com.netchus.util.MyDateUtil;


@Service
public class SensorServiceImpl implements SensorService {

	@Override
	public ArrayList<EnvironmentVO> getResponse() {
		// 가짜로 데이터 만들어서 보내는거
		ArrayList<EnvironmentVO> list = new ArrayList<EnvironmentVO>();
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		String res = format.format(d);
		
		EnvironmentVO vo1 = new EnvironmentVO("Sensor-001",36.8,6.6,7.0,7.0,8.6,0.0,534.0,res);
		EnvironmentVO vo2 = new EnvironmentVO("Sensor-002",24.8,16.4,8.0,8.0,8.6,0.0,469.0,res);
		EnvironmentVO vo3 = new EnvironmentVO("Sensor-003",15.4,23.1,16.0,14.0,8.6,0.0,437.0,res);
		EnvironmentVO vo4 = new EnvironmentVO("Sensor-004",24.1,14.0,15.0,15.0,8.6,0.0,557.0,res);
		EnvironmentVO vo5 = new EnvironmentVO("Sensor-005",36.8,6.6,7.0,7.0,8.6,0.0,534.0,res);
		EnvironmentVO vo6 = new EnvironmentVO("Sensor-006",24.8,16.4,8.0,8.0,8.6,0.0,469.0,res);
		EnvironmentVO vo7 = new EnvironmentVO("Sensor-007",15.4,23.1,16.0,14.0,8.6,0.0,437.0,res);
		EnvironmentVO vo8 = new EnvironmentVO("Sensor-008",24.1,14.0,15.0,15.0,8.6,0.0,557.0,res);
		EnvironmentVO vo9 = new EnvironmentVO("Sensor-009",15.4,23.1,16.0,14.0,8.6,0.0,437.0,res);
		EnvironmentVO vo10 = new EnvironmentVO("Sensor-010",24.1,14.0,15.0,15.0,8.6,0.0,557.0,res);
		System.out.println(d.toString());
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);
		list.add(vo6);
		list.add(vo7);
		list.add(vo8);
		list.add(vo9);
		list.add(vo10);
		return list;
	}
	

}
