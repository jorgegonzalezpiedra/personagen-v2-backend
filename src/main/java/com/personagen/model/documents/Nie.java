package com.personagen.model.documents;

/**
 * Nie. The format is A-NNNNNNN-A, where the first character is either X, Y, or Z and the last character is a checksum letter <br>
 * X: para los NIE cuya fecha de asignación es anterior a 2008. <br>
 * Y: para los NIE con una fecha posterior.<br>
 * Z: está prevista para el momento en que se agoten las posibilidades con Y.<br>
 *
 * la letra de control se calcula: <br>
 * Se sustituye la X por 0, la Y por 1 o la Z por 2, se le añaden los 7 dígitos, y la cifra resultante se divide entre 23.
 * La letra final la tabla una marca
 *
 * for more info see <a href="https://www.nie.com.es/letra.html">Nie</a>
 *
 */
public class Nie {
}
