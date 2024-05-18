package com.personagen.model.documents;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Nie. The format is A-NNNNNNN-A, where the first character is either X, Y, or Z and the last character is a checksum letter <br>
 * X: para los NIE cuya fecha de asignación es anterior a 2008. <br>
 * Y: para los NIE con una fecha posterior.<br>
 * Z: está prevista para el momento en que se agoten las posibilidades con Y.<br>
 *
 * la letra de control se calcula: <br>
 * Se sustituye la X por 0, la Y por 1 o la Z por 2, se le añaden los 7 dígitos, y la cifra resultante se divide entre 23.
 * La letra final la marca una tabla
 *
 * for more info see <a href="https://www.nie.com.es/letra.html">Nie</a>
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Nie extends Document{

    private String firstLetter;
    private String lastLetter;
}
