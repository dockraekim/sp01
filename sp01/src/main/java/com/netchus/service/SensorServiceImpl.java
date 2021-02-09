package com.netchus.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.netchus.domain.EnvironmentVO;


@Service
public class SensorServiceImpl implements SensorService {

	@Override
	public ArrayList<EnvironmentVO> getResponse() {
		// 가짜로 데이터 만들어서 보내는거
		ArrayList<EnvironmentVO> list = new ArrayList<EnvironmentVO>();
		Date d = new Date();
		EnvironmentVO vo1 = new EnvironmentVO("PTUI-003",36.8,6.6,7.0,7.0,8.6,0.0,534.0,d);
		EnvironmentVO vo2 = new EnvironmentVO("PTUI-004",24.8,16.4,8.0,8.0,8.6,0.0,469.0,d);
		EnvironmentVO vo3 = new EnvironmentVO("PTUI-005",15.4,23.1,16.0,14.0,8.6,0.0,437.0,d);
		EnvironmentVO vo4 = new EnvironmentVO("PTUI-006",24.1,14.0,15.0,15.0,8.6,0.0,557.0,d);
		System.out.println(d.toString());
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		return list;
	}
	

}
