package com.test.parse.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sentence {

//	@SuppressWarnings("unused")
//	private static final long serialVersionUID= 646365 ;
	
	private List<String> word;
}
