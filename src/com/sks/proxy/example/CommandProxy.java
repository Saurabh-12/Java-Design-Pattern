package com.sks.proxy.example;

public class CommandProxy implements CommandInterface {

	private boolean isAdmin;
	private CommandImplementation executor;

	public CommandProxy(String user, String pwd) {
		if ("Saurabh".equals(user) && "saurabh123k".equals(pwd))
			isAdmin = true;
		executor = new CommandImplementation();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			} else {
				executor.runCommand(cmd);
			}
		}
	}

}
