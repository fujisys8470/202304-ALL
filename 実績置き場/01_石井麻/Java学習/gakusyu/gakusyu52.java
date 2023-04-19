package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class gakusyu52 {
	public static void main(){
		Path dirpath = Paths.get("C:\\Users\\tmp");
		
		try (Stream<Path> stream = Files.list(dirpath)){
			stream.forEach(p -> {
				try{
					System.out.print(p.getFileName() + " : ");
					System.out.println(Files.size(p) + " byte");
				}catch(IOException e) {
					System.out.println(e);
				}
			});
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
