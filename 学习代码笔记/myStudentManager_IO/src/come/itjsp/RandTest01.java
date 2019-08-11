package come.itjsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

/*
 * 随机读取和写入RandomAccessFile
 */
public class RandTest01 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/come/itjsp/Copy.java"), "r");
	
		//随机读取
		raf.seek(2);
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=raf.read(flush))!=-1){
			System.out.println(new String(flush,0,len));
		}
		
		
		raf.close();
	}
}
