package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; // java new input output
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		// listing files in a directory

		Files.list(Paths.get(".")).forEach(System.out::println);
		// used to list files with "." elememt under current working directory

		Path currentDirectory = Paths.get(".");
		Files.walk(currentDirectory, 4).filter(path -> String.valueOf(path).contains(".java"))
				.forEach(System.out::println); // walk method implementation

		// another method to search through a file
		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();

		Files.find(currentDirectory, 4, matcher).forEach(System.out::println); // gives the java files only
		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println); // prints out all directories

	}
}
