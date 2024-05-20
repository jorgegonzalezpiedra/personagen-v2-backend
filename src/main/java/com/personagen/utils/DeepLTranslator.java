package com.personagen.utils;

import com.deepl.api.DeepLException;
import com.deepl.api.TextResult;
import com.deepl.api.Translator;
import org.springframework.beans.factory.annotation.Value;

public class DeepLTranslator {

    @Value("${deeplApiKey}")
    private static String apiKey;

    public static String translate(String text, String sourceLang, String targetLang) throws DeepLException, InterruptedException {
        Translator translator = new Translator(apiKey);
        TextResult translatedText =
                translator.translateText(text, sourceLang, targetLang);
        return translatedText.getText();
    }
}
