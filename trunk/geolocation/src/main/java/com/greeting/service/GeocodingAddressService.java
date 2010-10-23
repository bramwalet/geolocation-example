package com.greeting.service;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class GeocodingAddressService implements AddressService {

	public String getAddress(String latLong) {
		try {
			URL mapsUrl = new URL(
					"http://maps.googleapis.com/maps/api/geocode/xml?latlng="
							+ latLong + "&sensor=true");
			InputStream openStream = mapsUrl.openStream();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(openStream);
			NodeList formattedAddress = doc.getElementsByTagName("formatted_address");
			Element formattedAddressElement = (Element) formattedAddress.item(0);
			return formattedAddressElement.getTextContent();
		} catch (Exception e) {
			return null;
		}
	}
}
