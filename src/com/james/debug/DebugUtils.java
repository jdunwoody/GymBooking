package com.james.debug;

import java.io.FileWriter;

public class DebugUtils {
	public static String dumpToFile(String contentAsString) throws Exception {
		String path = "/tmp/dump" + System.currentTimeMillis();
		FileWriter writer = new FileWriter(path);
		writer.write(contentAsString);
		writer.close();
		return path;
	}
}
