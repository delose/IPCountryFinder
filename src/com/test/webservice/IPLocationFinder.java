package com.test.webservice;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass in one IP address.");
		} else {
			String ipaddress = args[0];
			GeoIPService ipService = new GeoIPService(); // new instance of service
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap(); // creating SOAP
			GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipaddress); // does call of web service
			System.out.println(geoIp.getCountryName());
		}
	}
	
}
