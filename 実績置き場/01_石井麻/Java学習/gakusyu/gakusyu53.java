package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.LocalDateTime;

public class gakusyu53 {
	public static String main(){
		Path p = Paths.get("C:\\Users\\tmp\\test.txt");
		String res;
		LocalDateTime localDateTime = LocalDateTime.now();
		
		try{
			FileTime fileTime = Files.getLastModifiedTime(p);
			Instant instant = fileTime.toInstant();
			localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
			
			System.out.println(localDateTime);
		}catch(IOException e){
			System.out.println(e);
		}
		
		res = localDateTime.toString();
		System.out.println(res);
		return res;
	}
}
