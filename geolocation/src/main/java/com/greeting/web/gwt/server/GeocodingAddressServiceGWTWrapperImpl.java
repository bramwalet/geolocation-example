package com.greeting.web.gwt.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.greeting.service.AddressService;
import com.greeting.web.gwt.client.GeocodingAddressServiceGWTWrapper;

public class GeocodingAddressServiceGWTWrapperImpl extends AutoinjectingRemoteServiceServlet
	implements GeocodingAddressServiceGWTWrapper {
	private static final long serialVersionUID = 1L;
	
	private AddressService addressServiceSpring;
	
	public String getAddress(String name)  {
		return addressServiceSpring.getAddress(name);
	}

	@Autowired
	@Required
	public void setAddressService(AddressService greetingService) {
		this.addressServiceSpring = greetingService;
	}
}
