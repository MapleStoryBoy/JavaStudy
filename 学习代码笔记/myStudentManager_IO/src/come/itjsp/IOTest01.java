package come;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOTest01 {

	public static void main(String[] args) {
		// 创建源
		File src = new File("abc.txt");
		//选择流
		Reader reader = null;
		try {
			reader = new FileReader(src);
			//操作（分段读取）
			char[] flush = new char[1024];//缓冲器
			int len = -1;
			while ((len=reader.read(flush))!=-1){
				//字符数组-->字符串
				String str = new String(flush,0,len);
				System.out.println(str);
				
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(null!=reader){
					reader.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
