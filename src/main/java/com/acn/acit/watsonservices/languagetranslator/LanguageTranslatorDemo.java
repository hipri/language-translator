package com.acn.acit.watsonservices.languagetranslator;

import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.TranslateOptions;
import com.ibm.watson.developer_cloud.language_translator.v2.model.TranslationResult;
import com.ibm.watson.developer_cloud.language_translator.v2.util.Language;

public class LanguageTranslatorDemo {

	public static void main(String[] args) {
		LanguageTranslator service = new LanguageTranslator();
		service.setUsernameAndPassword("1c235cf5-b399-42b2-8862-1b3bc7884100", 
				"5zLfigvV0RLM");

		TranslateOptions translateOptions = new TranslateOptions.Builder().addText("hello")
				.source(Language.ENGLISH)
				.target(Language.SPANISH).build();

		TranslationResult result = service.translate(translateOptions).execute();

		System.out.println(result);
	}

}
