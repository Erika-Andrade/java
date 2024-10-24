package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement psB = null;
		PreparedStatement psT = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Erii2007.");
			System.out.println("conexion exitosa");
			
			 ps=connection.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,cantidad_ahorrada,estatura,fecha_nacimiento,hora_nacimiento)"
					 + "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,"1016507999");
			ps.setString(2,"Monserath");
			ps.setString(3,"Benalcazar");
			ps.setString(4,"U"); ps.setInt(5,2);
			ps.setDouble(7,1.78);
			ps.setBigDecimal(6,new BigDecimal(1200.24)); 
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr="2020/03/22";
			 
			// tabla transacciones
			psT = connection.prepareStatement(
					"insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha)" + "values(?,?,?,?,?)");
			psT.setInt(1, 8);
			psT.setString(2, "88888");
			psT.setBigDecimal(3, new BigDecimal(345.67));
			psT.setString(4, "C");
			String fechaTrans = "2024/05/13";
			// tabla banco
			psB = connection
					.prepareStatement("insert into banco(codigo_banco,codigo_transaccion,detalle)" + "values(?,?,?)");
			psB.setInt(1, 3);
			psB.setInt(2, 8);
			psB.setString(3, "Retiro");

			try {
				Date fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis= fecha.getTime();
				System.out.println(fechaMilis);
				//craea un java sqlDate saliendo del java.uril
				java.sql.Date fechaSQL= new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);
				ps.executeUpdate();
				System.out.println("idk");
				
				Date fechaT = sdf.parse(fechaTrans);
				System.out.println(fechaT);
				long fechaMilisT = fechaT.getTime();
				System.out.println(fechaMilis);
				// craea un java sqlDate saliendo del java.uril
				java.sql.Date fechaSQL2 = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL2);

				Time timeSQL1 = new Time(fechaMilis);
				System.out.println(timeSQL);

				psT.setDate(5, fechaSQL);

				psT.executeUpdate();
				System.out.println("insert exitoso en tablas transaccions");
				psB.executeUpdate();
				System.out.println("insert exitoso en tablas bancos");

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
