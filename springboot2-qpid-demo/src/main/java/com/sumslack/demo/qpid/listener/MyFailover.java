package com.sumslack.demo.qpid.listener;

import org.apache.qpid.jms.BrokerDetails;
import org.apache.qpid.jms.failover.FailoverMethod;

public class MyFailover implements FailoverMethod{

	@Override
	public void attainedConnection() {
		System.out.println("MyFailover====attainedConnection=====");
		
	}

	@Override
	public boolean failoverAllowed() {
		System.out.println("MyFailover====failoverAllowed=====");
		return true;
	}

	@Override
	public BrokerDetails getCurrentBrokerDetails() {
		System.out.println("MyFailover====getCurrentBrokerDetails=====");
		return null;
	}

	@Override
	public BrokerDetails getNextBrokerDetails() {
		System.out.println("MyFailover====getNextBrokerDetails=====");
		return null;
	}

	@Override
	public String methodName() {
		System.out.println("MyFailover====methodName=====");
		return null;
	}

	@Override
	public void reset() {
		System.out.println("MyFailover====reset=====");
		
	}

	@Override
	public void setBroker(BrokerDetails arg0) {
		System.out.println("====setBroker=====");
		
	}

	@Override
	public void setRetries(int arg0) {
		System.out.println("====setRetries=====");
		
	}

}
