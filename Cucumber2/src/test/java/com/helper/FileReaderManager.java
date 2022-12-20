package com.helper;

import java.io.IOException;

public class FileReaderManager {
	public static FileReaderManager getinstance() {
		FileReaderManager frm =new FileReaderManager();
return frm;
	}
	public configuration_reader getinstance2() throws IOException {
		configuration_reader d=new configuration_reader();
return d;
	}
}
