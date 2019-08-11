package come.itjsp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 文件字符输出流 加入缓冲流
 * 
 */
public class IOTest05 {
	public static void main(String[] args) {
		//创建源
		File dest = new File("dest.txt");
		//选择流
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(dest));
			//操作（写出）
			writer.append("IO is so easy");
			writer.newLine();
			writer.append("潘加树");
			writer.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//释放资源
			try{
				if(null!=writer){
					writer.close();
				}
			}catch(IOException e){
				
			}
		}
	}
}
