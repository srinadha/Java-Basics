package com.killcodewithsri.copy;

public class Browser {
	
	public void navigate(String address) {
		String ip = findIpAddress(address);
		String html = sendHttpRequest(ip);
		System.out.println(html);
	}

	private String sendHttpRequest(String ip) {
		// TODO Auto-generated method stub
		return "<html></html>";
	}

	public String findIpAddress(String address) {
		// TODO Auto-generated method stub
		return "127.0.0.7";
	}
	
	

}
