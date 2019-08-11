package come.itjsp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 文件字节输出流 加入缓冲流
 * 1，创建源
 * 2，选择流
 * 3，操作
 * 4，释放资源
 */
public class IOTest03 {
	public static void main(String[] args) {
		//创建源
		File dest = new File("dest.txt");
		//选择流
		OutputStream os = null;
		try {
			os = new BufferedOutputStream(new FileOutputStream(dest));
			//操作（写出）
			String msg = "IO is so easy\r\n我是谁？";
			byte[] datas = msg.getBytes();//字符串-->字节数组（编码）
			os.write(datas,0,datas.length);
			os.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//释放资源
			try {
				if (null!=os){
					os.close();
				}
			}catch(IOException e){
				
			}
		}
	}
}
