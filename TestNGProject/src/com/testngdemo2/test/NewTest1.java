package com.testngdemo2.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class NewTest1 implements ITestListener{
  @Test(priority=1)
  public void f() {
	  System.out.println("Test f");  
  }
  
  @Test(priority=3)
  public void c() {
	  System.out.println("Test c");  
  }
  
  @Test(priority=2)
  public void a() {
	  System.out.println("Test a");  
  }

@Override
public void onTestStart(ITestResult result) {
	System.out.println("onTestStart");
	
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
