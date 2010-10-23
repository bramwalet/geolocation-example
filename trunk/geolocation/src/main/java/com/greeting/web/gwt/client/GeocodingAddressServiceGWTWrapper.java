package com.greeting.web.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greetingService")
public interface GeocodingAddressServiceGWTWrapper extends RemoteService {
  String getAddress(String name);
}
