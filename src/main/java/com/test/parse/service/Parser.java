package com.test.parse.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.test.parse.dto.Sentence;

public class Parser {

//	public List<Sentence> parseText(String inputPath) {
//		List<Sentence> sortedWords = new ArrayList<>();
//		TextCleaner textCleaner = new TextCleaner();
//		try {
//			File file = new File(inputPath);
//			Scanner scanner = new Scanner(file);
//			while (scanner.hasNextLine()) {
//				String line = scanner.nextLine();
//				List<String> sentences = Arrays.stream(line.split("(?<!Mr|Mrs)[?!.]\\s+"))
//						.filter(element -> !element.isEmpty()).collect(Collectors.toList());
//				for (String sentence : sentences) {
//           	  String[] words = sentence.split("\\s+");
//					List<String> words = Arrays.stream(sentence.split("[\\s:!,-]+"))
//							.map(e -> textCleaner.removeLeadingHyphen(e)).map(e -> textCleaner.removeTrailingHyphen(e))
//							.map(e -> textCleaner.removenewLine(e)).map(e -> textCleaner.removeTab(e))
//							.map(e -> textCleaner.removespecialCharacters(e)).map(e -> textCleaner.removelastDots(e))
//							.map(e -> textCleaner.isNullorWhiteSpace(e)).collect(Collectors.toList());

//					if (!words.isEmpty()) {
//						Collections.sort(words, Collator.getInstance(Locale.ENGLISH));
//						sortedWords.add(new Sentence(words));
//					}
//				}
//			}
//		} catch (FileNotFoundException e) {
//			System.err.println("File not found: " + inputPath);
//		}
//}}
//		return sortedWords;
//	}
//}
}
