package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path pathFiletoRead = Paths.get("./Resources/Data.txt");

		List<String> list = List.of("Sev", "Boy", "Dog", "Elephant");
		Files.write(pathFiletoRead, list).forEach(System.out::println);

	}

}
