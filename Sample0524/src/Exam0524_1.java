import java.io.FileInputStream;
public class Exam0524_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 파일 읽어오기
		FileInputStream fis = new FileInputStream("c://koreait//eclipse//data1.txt");
		
		int ch;
		byte[] bt = new byte[1024];
		int i =0;
		
		
		while((ch = fis.read()) != -1) {
			bt[i] = (byte)ch;
			i++;
		}
		
		System.out.print(new String(bt));
		fis.close();
	}

}
