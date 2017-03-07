package com.ipartek.formacion;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import net.webservicex.credit.FinanceService;
import net.webservicex.credit.FinanceServiceSoap;
import net.webservicex.creditcard.CCChecker;
import net.webservicex.creditcard.CCCheckerSoap;
import net.webservicex.es.biblia.libros.BibleWebservice;
import net.webservicex.es.biblia.libros.BibleWebserviceSoap;
import net.webservicex.es.correos.oficinasbuzones.OficinasBuzones;
import net.webservicex.es.correos.oficinasbuzones.OficinasBuzonesSoap;
import net.webservicex.geoip.GeoIP;
import net.webservicex.geoip.GeoIPService;
import net.webservicex.geoip.GeoIPServiceSoap;


public class Main {

	public static void main(String[] args) {
		// Servicio web de validacion de tarjetas de credito
		if (validarTarjetaCredito()){
			System.out.println("Tarjeta valida");
		}else {
			System.out.println("Tarjeta NO valida");
		}
		// Servicio web de GeoIP
		GeoIP geoip = obtenerIP();
		System.out.println("La direccion IP es: " + geoip.getIP());
		geoip = obtenerPais(geoip.getIP());
		System.out.println("El pais es :" + geoip.getCountryName());
		// Servicio web de prestamos
		double apr = obtenerAPR(2,2,2,2);
		System.out.println("El APR es: " + apr);
		double leasemp = obtenerLeaseMonthlyPayment(2,2,2,2);
		System.out.println("El LeaseMP es: " + leasemp);
		double loanmp = obtenerLoanMonthlyPayment();
		System.out.println("El LoanMP es: " + loanmp);
		// Listado de provincias
		Map<Integer, Provincia> provincias = getProvincias();
		for (Map.Entry<Integer, Provincia> entry : provincias.entrySet()){
			Provincia provincia = entry.getValue();
			Integer codigo = entry.getKey();
			System.out.println(provincia.toString());
		}
		// Listado de libros de la bibliaaaagh
		Map<Integer, Libro> libros = getBooks();
		for (Map.Entry<Integer, Libro> entry : libros.entrySet()){
			Libro libro = entry.getValue();
			Integer codigo = entry.getKey();
			System.out.println(libro.toString());
		}
	}

	private static boolean validarTarjetaCredito() {
		boolean valido = false;
		CCChecker checker = new CCChecker();
		CCCheckerSoap soapclient = checker.getCCCheckerSoap();
		String resultado = soapclient.validateCardNumber("VISA", "4444555559999999");
		if(resultado.toUpperCase().contains("NOT VALID")){
			valido = false;
		}else{
			valido = true;
		}
		System.out.println(resultado + " " + valido);
		return valido;
	}
	
	private static GeoIP obtenerIP(){
		GeoIP geoip = null;
		try {
			GeoIPService cliente = new GeoIPService();
			GeoIPServiceSoap clientesoap = cliente.getGeoIPServiceSoap();
			geoip = clientesoap.getGeoIPContext();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return geoip;
	}
	
	private static GeoIP obtenerPais(String ip){
		GeoIP geoip = null;
		try {
			GeoIPService cliente = new GeoIPService();
			GeoIPServiceSoap clientesoap = cliente.getGeoIPServiceSoap();
			geoip = clientesoap.getGeoIP(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return geoip;
	}
	
	private static double obtenerAPR (double loanAmount, double extraCost, double interestRate, double months){
		double apr = 0;
		FinanceService finanza = new FinanceService();
		FinanceServiceSoap finanzasoap = finanza.getFinanceServiceSoap();
		apr = finanzasoap.apr(loanAmount, extraCost, interestRate, months);
		return apr;
	}
	
	private static double obtenerLeaseMonthlyPayment (double loanAmount, double residualValue,
			double interestRate, double months){
		double lmp = 0;
		FinanceService finanza = new FinanceService();
		FinanceServiceSoap finanzasoap = finanza.getFinanceServiceSoap();
		lmp = finanzasoap.leaseMonthlyPayment(loanAmount, residualValue, interestRate, months);
		return lmp;
	}
	
	private static double obtenerLoanMonthlyPayment (){
		double lmp = 0;
		Scanner in = new Scanner(System.in);
		FinanceService finanza = new FinanceService();
		FinanceServiceSoap finanzasoap = finanza.getFinanceServiceSoap();
		System.out.println("Introduce el interes del prestamo: ");
		double interestRate = in.nextDouble();
		System.out.println("Introduce la cantidad del prestamo: ");
		double loanAmount = in.nextDouble();
		System.out.println("Introduce los meses: ");
		double months = in.nextDouble();
		lmp = finanzasoap.loanMonthlyPayment(loanAmount, interestRate, months);
		in.close();
		return lmp;
	}
	private static Map<Integer, Provincia> getProvincias(){
		Map<Integer, Provincia> provincias = null;
		OficinasBuzones cliente = new OficinasBuzones();
		OficinasBuzonesSoap clientesoap = cliente.getOficinasBuzonesSoap();
		String texto = clientesoap.consultaProvincias("");
		
		provincias = parseToMapProvincias(texto);
		
		return provincias;
	}

	private static Map<Integer, Provincia> parseToMapProvincias(String texto) {
		Map<Integer, Provincia> provincias = null;
		// Esta clase permite trabajar con tipos de datos XML
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		Document doc = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();
			// En doc se almacena todo el documento XML, se parsea a XML
			doc = docBuilder.parse(new InputSource(new ByteArrayInputStream(texto.getBytes("Windows-1252"))));
			int len = doc.getElementsByTagName("provincia").getLength();
			Provincia provincia = null;
			provincias = new HashMap<Integer, Provincia>();
			for (int i = 0; i < len; i++) {
				provincia = new Provincia();
				// Obtenemos el valor de la provincia y hacemos set del atributo del objeto provincia
				Node prov = doc.getElementsByTagName("provincia").item(i);
				provincia.setNombre(prov.getFirstChild().getNodeValue());
				NamedNodeMap attrs = prov.getAttributes();
				// Ahora obtenemos el valor del nodo y lo fijamos en el objeto provincia
				int codigo = Integer.parseInt(attrs.getNamedItem("id").getNodeValue());
				provincia.setCodigo(codigo);
				// Añadimos al mapa de provincias el codigo y el objeto
				provincias.put(provincia.getCodigo(), provincia);
			}
		} catch (ParserConfigurationException e) {
			e.getMessage();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return provincias;
	}
	
	private static Map<Integer, Libro> getBooks(){
		Map<Integer, Libro> libros = null;
		BibleWebservice cliente = new BibleWebservice();
		BibleWebserviceSoap clientesoap = cliente.getBibleWebserviceSoap();
		String texto = clientesoap.getBookTitles();
		
		libros = parseToMapBibleBooks(texto);
		
		return libros;
	}
	
	private static Map<Integer, Libro> parseToMapBibleBooks(String texto){
		Map<Integer, Libro> libros = null;
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		Document doc = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();
			doc = docBuilder.parse(new InputSource(new ByteArrayInputStream(texto.getBytes())));
			int len = doc.getElementsByTagName("BookTitle").getLength();
			Libro libro = null;
			libros = new HashMap<Integer, Libro>();
			for (int i = 0; i < len; i++) {
				libro = new Libro();
				Node lib = doc.getElementsByTagName("BookTitle").item(i);
				libro.setTitulo(lib.getFirstChild().getNodeValue());
				System.out.println(lib.getPreviousSibling().getPreviousSibling().getNodeValue());
				//libro.setNumero(Integer.parseInt(lib.getPreviousSibling().getPreviousSibling().getNodeValue()));
				// Asi tambien tira, pero es menos eficiente
				//lib = doc.getElementsByTagName("Book").item(i);
				//libro.setNumero(Integer.parseInt(lib.getFirstChild().getNodeValue()));
				libros.put(libro.getNumero(), libro);
			}
		} catch (ParserConfigurationException e) {
			e.getMessage();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libros;
	}
	
}
