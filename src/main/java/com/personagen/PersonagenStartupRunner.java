package com.personagen;

import com.personagen.constants.PersonagenConstants;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonagenStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //initialize constants list of codes having the maps
        //SOCIETY TYPES CIF
        List<String> societyTypesCodes = new ArrayList<>();
        for (Map.Entry<String, String> entry : PersonagenConstants.SOCIETY_TYPES_CIF_MAP.entrySet()) {
            societyTypesCodes.add(entry.getKey());
        }
        PersonagenConstants.SOCIETY_TYPES_CIF_CODE_LIST = new ArrayList<>(societyTypesCodes);

        //PROVINCE CODES CIF
        List<Integer> provincesCodes = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : PersonagenConstants.PROVINCES_CODES_MAP.entrySet()) {
            provincesCodes.add(entry.getKey());
        }
        PersonagenConstants.PROVINCES_CODES_LIST = new ArrayList<>(provincesCodes);

        //LETTERS NIE LIST
        List<String> lettersNie = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : PersonagenConstants.FIRST_LETTERS_NIE_MAP.entrySet()) {
            lettersNie.add(entry.getKey());
        }
        PersonagenConstants.FIRST_LETTERS_NIE_LIST = new ArrayList<>(lettersNie);
    }
}
