package com.personagen.constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonagenConstants {

    public static final List<String> SWAGGER_ENDPOINTS = List.of("/swagger-ui/index.html",
            "/swagger-ui/swagger-ui.css", "/swagger-ui/swagger-ui-bundle.js",
            "/swagger-ui/swagger-ui-standalone-preset.js", "/swagger-ui/swagger-initializer.js",
            "/swagger-ui/favicon-32x32.png", "/swagger-ui/favicon-32x32.png",
            "/swagger-ui/favicon-16x16.png", "/swagger-ui.html", "/v3/api-docs/swagger-config", "/v3/api-docs",
            "/swagger-ui/index.css");
    public static final Map<String, String> SOCIETY_TYPES_CIF_MAP;

    static {
        SOCIETY_TYPES_CIF_MAP = new HashMap<>();
        SOCIETY_TYPES_CIF_MAP.put("A", "Sociedad Anónima");
        SOCIETY_TYPES_CIF_MAP.put("B", "Sociedad de Responsabilidad Limitada");
        SOCIETY_TYPES_CIF_MAP.put("C", "Sociedad Colectiva");
        SOCIETY_TYPES_CIF_MAP.put("D", "Sociedad Comanditaria");
        SOCIETY_TYPES_CIF_MAP.put("E", "Comunidad de Bienes");
        SOCIETY_TYPES_CIF_MAP.put("F", "Sociedad Cooperativa");
        SOCIETY_TYPES_CIF_MAP.put("G", "Asociaciones y otros tipos no definidos");
        SOCIETY_TYPES_CIF_MAP.put("H", "Comunidad de propietarios en régimen de propiedad horizontal");
        SOCIETY_TYPES_CIF_MAP.put("N", "Entidades no residentes");
        SOCIETY_TYPES_CIF_MAP.put("P", "Corporación local");
        SOCIETY_TYPES_CIF_MAP.put("Q", "Organismo autónomo estatal o no, y asimilados, congregaciones e instituciones religiosas");
        SOCIETY_TYPES_CIF_MAP.put("S", "Organos de la Administración del Estado y Comunidades Autónomas");
    }

    public static List<String> SOCIETY_TYPES_CIF_CODE_LIST;

    public static final Map<Integer, String> PROVINCES_CODES_MAP;

    static {
        PROVINCES_CODES_MAP = new HashMap<>();
        PROVINCES_CODES_MAP.put(1, "Alava");
        PROVINCES_CODES_MAP.put(2, "Albacete");
        PROVINCES_CODES_MAP.put(3, "Alicante");
        PROVINCES_CODES_MAP.put(53, "Alicante");
        PROVINCES_CODES_MAP.put(54, "Alicante");
        PROVINCES_CODES_MAP.put(4, "Almería");
        PROVINCES_CODES_MAP.put(5, "Ávila");
        PROVINCES_CODES_MAP.put(6, "Badajoz");
        PROVINCES_CODES_MAP.put(7, "Islas Baleares");
        PROVINCES_CODES_MAP.put(57, "Islas Baleares");
        PROVINCES_CODES_MAP.put(8, "Barcelona");
        PROVINCES_CODES_MAP.put(58, "Barcelona");
        PROVINCES_CODES_MAP.put(59, "Barcelona");
        PROVINCES_CODES_MAP.put(60, "Barcelona");
        PROVINCES_CODES_MAP.put(61, "Barcelona");
        PROVINCES_CODES_MAP.put(62, "Barcelona");
        PROVINCES_CODES_MAP.put(63, "Barcelona");
        PROVINCES_CODES_MAP.put(64, "Barcelona");
        PROVINCES_CODES_MAP.put(9, "Burgos");
        PROVINCES_CODES_MAP.put(10, "Cáceres");
        PROVINCES_CODES_MAP.put(11, "Cádiz");
        PROVINCES_CODES_MAP.put(72, "Cádiz");
        PROVINCES_CODES_MAP.put(12, "Castellón");
        PROVINCES_CODES_MAP.put(13, "Ciudad Real");
        PROVINCES_CODES_MAP.put(14, "Córdoba");
        PROVINCES_CODES_MAP.put(56, "Córdoba");
        PROVINCES_CODES_MAP.put(15, "A Coruña");
        PROVINCES_CODES_MAP.put(70, "A Coruña");
        PROVINCES_CODES_MAP.put(16, "Cuenca");
        PROVINCES_CODES_MAP.put(17, "Girona");
        PROVINCES_CODES_MAP.put(55, "Girona");
        PROVINCES_CODES_MAP.put(18, "Granada");
        PROVINCES_CODES_MAP.put(19, "Guadalajara");
        PROVINCES_CODES_MAP.put(20, "Guipúzcoa");
        PROVINCES_CODES_MAP.put(71, "Guipúzcoa");
        PROVINCES_CODES_MAP.put(21, "Huelva");
        PROVINCES_CODES_MAP.put(22, "Huesca");
        PROVINCES_CODES_MAP.put(23, "Jaén");
        PROVINCES_CODES_MAP.put(24, "León");
        PROVINCES_CODES_MAP.put(25, "Lleida");
        PROVINCES_CODES_MAP.put(26, "La Rioja");
        PROVINCES_CODES_MAP.put(27, "Lugo");
        PROVINCES_CODES_MAP.put(28, "Madrid");
        PROVINCES_CODES_MAP.put(78, "Madrid");
        PROVINCES_CODES_MAP.put(79, "Madrid");
        PROVINCES_CODES_MAP.put(80, "Madrid");
        PROVINCES_CODES_MAP.put(81, "Madrid");
        PROVINCES_CODES_MAP.put(82, "Madrid");
        PROVINCES_CODES_MAP.put(83, "Madrid");
        PROVINCES_CODES_MAP.put(84, "Madrid");
        PROVINCES_CODES_MAP.put(29, "Málaga");
        PROVINCES_CODES_MAP.put(92, "Málaga");
        PROVINCES_CODES_MAP.put(93, "Málaga");
        PROVINCES_CODES_MAP.put(30, "Murcia");
        PROVINCES_CODES_MAP.put(73, "Murcia");
        PROVINCES_CODES_MAP.put(31, "Navarra");
        PROVINCES_CODES_MAP.put(32, "Ourense");
        PROVINCES_CODES_MAP.put(33, "Oviedo");
        PROVINCES_CODES_MAP.put(74, "Oviedo");
        PROVINCES_CODES_MAP.put(34, "Palencia");
        PROVINCES_CODES_MAP.put(35, "Las Palmas");
        PROVINCES_CODES_MAP.put(76, "Las Palmas");
        PROVINCES_CODES_MAP.put(36, "Pontevedra");
        PROVINCES_CODES_MAP.put(94, "Pontevedra");
        PROVINCES_CODES_MAP.put(37, "Salamanca");
        PROVINCES_CODES_MAP.put(38, "Santa Cruz de Tenerife");
        PROVINCES_CODES_MAP.put(75, "Santa Cruz de Tenerife");
        PROVINCES_CODES_MAP.put(39, "Cantabria");
        PROVINCES_CODES_MAP.put(40, "Segovia");
        PROVINCES_CODES_MAP.put(41, "Sevilla");
        PROVINCES_CODES_MAP.put(91, "Sevilla");
        PROVINCES_CODES_MAP.put(42, "Soria");
        PROVINCES_CODES_MAP.put(43, "Tarragona");
        PROVINCES_CODES_MAP.put(77, "Tarragona");
        PROVINCES_CODES_MAP.put(44, "Teruel");
        PROVINCES_CODES_MAP.put(45, "Toledo");
        PROVINCES_CODES_MAP.put(46, "Valencia");
        PROVINCES_CODES_MAP.put(96, "Valencia");
        PROVINCES_CODES_MAP.put(97, "Valencia");
        PROVINCES_CODES_MAP.put(98, "Valencia");
        PROVINCES_CODES_MAP.put(47, "Valladolid");
        PROVINCES_CODES_MAP.put(48, "Vizcaya");
        PROVINCES_CODES_MAP.put(95, "Vizakya");
        PROVINCES_CODES_MAP.put(49, "Zamora");
        PROVINCES_CODES_MAP.put(50, "Zaragoza");
        PROVINCES_CODES_MAP.put(99, "Zaragoza");
        PROVINCES_CODES_MAP.put(51, "Ceuta");
        PROVINCES_CODES_MAP.put(52, "Melilla");
    }

    public static List<Integer> PROVINCES_CODES_LIST;

    public static final Map<String, Integer> FIRST_LETTERS_NIE_MAP;

    static {
        FIRST_LETTERS_NIE_MAP = new HashMap<>();
        FIRST_LETTERS_NIE_MAP.put("X", 0);
        FIRST_LETTERS_NIE_MAP.put("Y", 1);
        FIRST_LETTERS_NIE_MAP.put("Z", 2);
    }
    public static List<String> FIRST_LETTERS_NIE_LIST;

    public static final Map<Integer, String> LETTERS_MODULE_MAP;

    static {
        LETTERS_MODULE_MAP = new HashMap<>();
        LETTERS_MODULE_MAP.put(0, "T");
        LETTERS_MODULE_MAP.put(1, "R");
        LETTERS_MODULE_MAP.put(2, "W");
        LETTERS_MODULE_MAP.put(3, "A");
        LETTERS_MODULE_MAP.put(4, "G");
        LETTERS_MODULE_MAP.put(5, "M");
        LETTERS_MODULE_MAP.put(6, "Y");
        LETTERS_MODULE_MAP.put(7, "F");
        LETTERS_MODULE_MAP.put(8, "P");
        LETTERS_MODULE_MAP.put(9, "D");
        LETTERS_MODULE_MAP.put(10, "X");
        LETTERS_MODULE_MAP.put(11, "B");
        LETTERS_MODULE_MAP.put(12, "N");
        LETTERS_MODULE_MAP.put(13, "J");
        LETTERS_MODULE_MAP.put(14, "Z");
        LETTERS_MODULE_MAP.put(15, "S");
        LETTERS_MODULE_MAP.put(16, "Q");
        LETTERS_MODULE_MAP.put(17, "V");
        LETTERS_MODULE_MAP.put(18, "H");
        LETTERS_MODULE_MAP.put(19, "L");
        LETTERS_MODULE_MAP.put(20, "C");
        LETTERS_MODULE_MAP.put(21, "K");
        LETTERS_MODULE_MAP.put(22, "E");
    }
}
