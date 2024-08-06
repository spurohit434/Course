package com.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Path pathFiletoRead = Paths.get("./Resources/Da.txt");
		String msg = " Currencies DO NOt match Exception ";
		// method
		if (!Files.exists(pathFiletoRead)) {
			throw new CurrenciesDoNotMatchException(msg);
		}

		System.out.println("naam ki dikkat nahi");

		// to read all the content of the file at once
//		List<String> lines = Files.readAllLines(pathFiletoRead);
//		System.out.println(lines);
//
//		// read single stream wise characters in file and process line 1 by 1
//		Files.lines(pathFiletoRead).forEach(System.out::println);
//		Files.lines(pathFiletoRead).filter(str -> str.contains("a")).forEach(System.out::println);
//		Files.lines(pathFiletoRead).map(String::toLowerCase).forEach(System.out::println);

	}

}

class CurrenciesDoNotMatchException extends Exception {
	/// it extends exception class
	public CurrenciesDoNotMatchException(String msg) {
		System.out.println(msg);
	}
}
