package com.sks.proxy.example;

public class CommandImplementation implements CommandInterface {

	@Override
	public void runCommand(String cmd) throws Exception {
		// some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");

	}

}
