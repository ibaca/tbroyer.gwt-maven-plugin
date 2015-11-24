package it.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import it.test.model.GreetingResponse;

public class E2ESharedGwtTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "it.test.E2EShared";
  }

  public void testShouldRun() {
    GreetingResponse greetingResponse = new GreetingResponse();
    greetingResponse.setGreeting("Hello world!");
    GWT.log(greetingResponse.getGreeting());
  }
}
