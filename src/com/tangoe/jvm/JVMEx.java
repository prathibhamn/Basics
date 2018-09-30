package com.tangoe.jvm;

public class JVMEx {
	
	public static void main(String[] args) {
		String jvmName = System.getProperty("java.vm.name");
		System.out.println(jvmName);
		System.out.println("JVM Bit size: " + System.getProperty("sun.arch.data.model"));
		System.out.println("JVM Bit size: " + System.getProperty("os.arch"));
	}

}
