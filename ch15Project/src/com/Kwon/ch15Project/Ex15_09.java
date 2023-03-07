package com.Kwon.ch15Project;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex15_09 {
	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[1]);
			
			int data = 0;
			while ((data = fr.read()) != -1) {
				fw.write(data);
				//출력 객체에 서줌 FileWriter (즉 출력파일에 작성)
			}
			fr.close();
			fw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
