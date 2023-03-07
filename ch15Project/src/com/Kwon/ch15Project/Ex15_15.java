package com.Kwon.ch15Project;

import java.io.File;
import java.io.IOException;

public class Ex15_15 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/testIo/Ex15_14.java");
		//기본생성자 : public File(String pathname);
		
		String fileName = f.getName();
		// public String getName() {
        // int index = path.lastIndexOf(separatorChar);
        // if (index < prefixLength) return path.substring(prefixLength);
        // return path.substring(index + 1);
		//경로 제외한 파일 이름 반환
		
		int pos = fileName.lastIndexOf(".");
		//확장자 앞의 .의 색인 번호
		System.out.println("경로를 제외한 파일 이름 - " + f.getName());
		System.out.println("확장자를 제외한 파일 이름 - " + fileName.substring(0,pos));
		System.out.println("경로를 포함한 파일 이름 - " + f.getPath());
		System.out.println("파일의 절대경로 - " + f.getAbsolutePath());
		System.out.println("파일의 정규경로 - " + f.getCanonicalPath());
		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		
		System.out.println("==============================");
		
		//디렉토리(폴더)
		System.out.println("File.pathSeparator : " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
		System.out.println("File.separator : " + File.separator);
		System.out.println("File.separatorChar : " + File.separatorChar);
		
	}
}
