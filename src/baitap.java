/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class baitap{
    private void fetchChild(File file) {
        System.out.println(file.getAbsolutePath());
        if (file.isDirectory()) {
 
            File[] children = file.listFiles();
 
            for (File child : children) {
                // Đệ quy (Recursive)
                this.fetchChild(child);
            }
        }
 
    }
    public static void readFile() throws IOException {
		
                String fileName = "C:/test/mytext.txt";//bạn hãy thay đổi đường dẫn tới file của bạn
		String content = new String(Files.readAllBytes(Paths.get(fileName)),
		StandardCharsets.UTF_8);//đưa về chuẩn utf-8
                System.out.println("-------NỘI DUNG------");
		System.out.println(content);
                System.out.println("-------VỊ TRÍ------");
                //vị trí trả về -1 là không xuất hiện chuỗi cần tìm trong file.
                System.out.println("indexOf(TGDD) -> vị trí " + content.indexOf("TGDD"));//kiểm tra TGDD có xuất hiện trong file hay không
	}
 
    public static void main(String[] args) throws IOException {
 
        baitap example = new baitap();
 
        File dir = new File("C:/test");
 
        example.fetchChild(dir);
        readFile();
                
                
	}
    }
    