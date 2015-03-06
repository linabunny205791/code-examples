package edu.csupomona.cs585;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class TestCommonsIo {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/yusun/Desktop/inav.pem");
		System.out.println(FilenameUtils.isExtension(file.getName(), "pem"));
		System.out.println(FilenameUtils.getPrefix(file.getAbsolutePath()));

		FileUtils.moveDirectory(new File("/Users/yusun/iphoto"),
				new File("/Users/yusun/iphoto2"));
	}

}
