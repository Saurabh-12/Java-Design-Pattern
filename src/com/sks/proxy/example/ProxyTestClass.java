package com.sks.proxy.example;

public class ProxyTestClass {

	public static void main(String[] args) {
		CommandInterface executor = new CommandProxy("Saurabh", "saurabh123k");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf /home/saurabh/workspace/JavaDesignPattern/src/com/sks/proxy/example/abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}

}
