package com.demopdf.test1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@Component
public class Test1 {
	
	
	
	public static byte[] test1() {
		File reportFile = new File("");
		Map parameters = new HashMap();
		try {
			JasperReport jasperReport = JasperCompileManager.compileReport(reportFile.getPath());
			byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, parameters);
		} catch (JRException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void test2() {
		String fileName = "E:\\\\report7.jrxml";
		String outFileName = "E:\\\\report7.pdf";
		HashMap hm = new HashMap();a
		try {

			JasperDesign jasperDesign = JRXmlLoader.load(fileName);

			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

			JasperPrint print = JasperFillManager.fillReport(jasperReport, hm, new JREmptyDataSource());

			JasperExportManager.exportReportToPdfFile(print, outFileName);

			System.out.println("Created file: " + outFileName);

		}

		catch (JRException e)

		{
			e.printStackTrace();

		}

		catch (Exception e)

		{
			e.printStackTrace();
		}

	}

}