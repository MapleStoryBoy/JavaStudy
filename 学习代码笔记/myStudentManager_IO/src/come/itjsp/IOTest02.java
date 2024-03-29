package come.itjsp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 四个步骤：分段读取 文件字节输入流 加入缓冲流
 * 1，创建源
 * 2，选择流
 * 3，操作
 * 4，释放资源
 */
public class IOTest02 {
	public static void main(String[] args) {
		test1();
		File src = new File("abc.txt");
		// 选择流
		InputStream is = null;
		try{
			is = new BufferedInputStream(new FileInputStream(src));
			//操作（分段读取）
			byte[] flush = new byte[1024];//缓冲容器
			int len = -1;//接收长度
			while ((len=is.read(flush))!=-1){
				//字节数组--->字符码  解码
				String str = new String(flush,0,len);
				System.out.println(str);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//释放资源
			try{
				if (null!=is){
					is.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void test1() {
		//创建源
		File src = new File("abc.txt");
		//选择流
		InputStream is= null;
		BufferedInputStream bis = null;
		try {
			is = new FileInputStream(src);
			bis = new BufferedInputStream(is);
			//操作（分段读取）
			byte[] flush = new byte[1024];//缓冲容器
			int len = -1;
			while((len=is.read(flush))!=-1){
				//字节数组---》字符串解码
				String str = new String(flush,0,len);
				System.out.println(str);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//释放资源
			try {
				if (null!=is){
					is.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			try {
				if(null!=bis){
					bis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
