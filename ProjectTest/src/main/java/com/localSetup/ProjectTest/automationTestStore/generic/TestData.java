package com.localSetup.ProjectTest.automationTestStore.generic;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class TestData {
		public static void main(String [] args) {
//			Fillo fillo=new Fillo();
//			Connection con=fillo.getConnection("/home/devil/Desktop/Movies.xlsx");
//			String query="Select  InvalidUserName from AccountLoginPage ";
//			Recordset rs=con.executeQuery(query);
//			while(rs.next()) {
//				ArrayList<String> fieldNames=rs.getFieldNames();
//				for(String fieldName : fieldNames) {
//					System.out.print(rs.getField(fieldName)+" ");
//				}
//				System.out.println();
//			}
//			rs.close();
//			con.close();
			
				getData("Movies", "AccountLoginPage", "InvalidUserName",0);
			
		}
		public static Fillo fillo=null;
		public static TestData testData=null;
		
		
		
		
		public  static TestData setter() {
			if(testData==null) {
				testData=new TestData();
				System.out.println("New obj Created for class testData");
			}
			else{
				testData=testData;
				System.out.println("Used already creTED OBJ for testData");
			}
			return testData;
		  }
		public static TestData getter() {
			TestData.filoGetter();
			return setter();
		}
		
		
		public  static Fillo filloSetter() {
			if(fillo==null) {
				fillo=new Fillo();
				System.out.println("New obj Created");
			}
			else{
				fillo=fillo;
				System.out.println("Used already creTED OBJ");
			}
			return fillo;
		  }
		public static Fillo filoGetter() {
			return filloSetter();
		}
		
		public static String getData(String fileName,String sheetName,String col,int index) {
			ArrayList<String> list= new ArrayList<String>();
			String testValue = null;
			Connection con;
			try {
				con = TestData.filoGetter().getConnection("/home/devil/Desktop/"+fileName+ ".xlsx");
				String query="Select  "+col+" from "+sheetName;
				Recordset rs=con.executeQuery(query);
				while(rs.next()) {
					ArrayList<String> fieldNames=rs.getFieldNames();
					
					for(String fieldName : fieldNames) {
						String value=rs.getField(fieldName);
						list.add(value);
						System.out.print("fetchvalue: "+value);
					}
				}
				rs.close();
				con.close();
						 testValue=list.get(index);
						System.out.println();
						System.out.println("testValue"+testValue);
			} catch (FilloException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return testValue;
			
		}

}
