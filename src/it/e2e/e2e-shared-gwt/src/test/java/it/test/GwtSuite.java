package it.test;

import it.test.client.E2ESharedGwtTest;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;

public class GwtSuite {
  public static Test suite() {
    GWTTestSuite suite = new GWTTestSuite("Test suite for E2E Shared GWT");
    suite.addTestSuite(E2ESharedGwtTest.class);
    return suite;
  }
}
