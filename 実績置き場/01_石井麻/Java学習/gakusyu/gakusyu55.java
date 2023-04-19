package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class gakusyu55 {
	public static void main(){
		Path dirpath = Paths.get("C:\\Users\\tmp");

		try(Stream<Path> stream = Files.walk(dirpath, 3)) {
			stream.forEach(p -> System.out.println(p.toString()));
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
