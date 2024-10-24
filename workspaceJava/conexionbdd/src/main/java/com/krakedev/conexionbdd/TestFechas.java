package com.krakedev.conexionbdd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		String fechaStr="2020/03/22";
		try {
			Date fecha=sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechaMilis= fecha.getTime();
			System.out.println(fechaMilis);
			//craea un java sqlDate saliendo del java.uril
			java.sql.Date fechaSQL= new java.sql.Date(fechaMilis);
			System.out.println(fechaSQL);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
