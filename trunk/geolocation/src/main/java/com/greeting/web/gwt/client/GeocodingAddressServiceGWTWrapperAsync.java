package com.greeting.web.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GeocodingAddressServiceGWTWrapperAsync {
  void getAddress(String input, AsyncCallback<String> callback);
}
