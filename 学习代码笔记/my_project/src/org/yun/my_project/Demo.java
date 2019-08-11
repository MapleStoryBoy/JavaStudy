package org.yun.my_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入
 BufferedReader：从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取
 */

public class Demo {
	public static void main(String[] args) throws IOException {
		//创建输出缓冲流对象
		/*
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		bw.writer("Hello");
		bw.flush();
		bw.close();
		*/
		//创建输入流缓冲对象
	
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		/*
		//一次读写一个字符
		int ch;
		while ((ch=br.read())!=-1){
			System.out.print((char)ch);
		}
		br.close();
		*/

		//一次一个字符数组
		char[] chs = new char[1024];
		int len;
		while ((len=br.read(chs))!=-1)
		{
			System.out.print(new String(chs,0,len));
		}
		br.close();
		
	}
}