package com.test.parse.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.parse.TestApplication;
import com.test.parse.dto.Sentence;


@Service
public class TextParser {
	
	@Autowired
	public CSVWriter writeToCSV ;
	

	private static final String OutputPath = null;

	private static Logger logger= LoggerFactory.getLogger(TestApplication.class);
	
//	public void TextParser {
//		
//		@Autowired
//		public Parser parse;
//		
//		@Autowired
//		public CSVWriter CSV;
		
//		String InputPath= "C:\\Users\\Dell\\Desktop\\TCS\\small.in";
//		File file= new File(InputPath);

//		String InputPath = "C:\\Users\\Dell\\Desktop\\TCS\\small.in";
//		String CSVOutputPath = "C:\\Users\\Dell\\Desktop\\TCS\\small.csv";
//		String XMLOutputPath = "C:\\Users\\Dell\\Desktop\\TCS\\small.xml";

//		try {
//			  List<Sentence> sortedWords  = parse.parseText(InputPath);
//		        if (XMLOutputPath.contains("xml")) {
//		            outputXml(sortedWords); }
//		        else 
//		        	if (CSVOutputPath.contains("csv")) {
//		        		CSV.writeToCSV(sortedWords);  } }
//				catch(IOException e) {
//				e.getStackTrace();
//		    }
//		}}
//			String Content= FileUtils.readFileToString(file,StandardCharsets.UTF_8);
//			List<sentence> sentenceList= Parser(Content);
			
////			Text txt= Text.builder().sentence(sentenceList).build();
//			String txt=sentenceList.toString();
//			XmlWriter.marshall(txt,OutputPath);
//			writeToCSV(txt,CSVOutputPath);
//            FileReader fr = new FileReader("C:\\\\Users\\m    \\Dell\\\\Desktop\\\\TCS\\\\small.in");
//
//		}
//		catch(IOException e) {
//		e.getStackTrace();
//		}
//		}
	}

