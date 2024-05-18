package com.personagen.model.documents;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Cif. This tax number  consists in: O P P N N N N N C being: <br>
 * O: Tipo de Organización  <br>
 * P: Código provincia  <br>
 * N: Número correlativo por provincia <br>
 * C: Dígito o letra de control <br>
 *
 * for more info see: <a href="http://www.aplicacionesinformaticas.com/programas/gratis/cif.php">Cif</a>
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class Cif extends Document{
    private String orgTypeCode;
    private String orgType;
    private String provinceCode;
    private String province;
    private String correlativeNumber;
    private String controlDigit;
}
