package com.personagen.model.documents;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Nif extends Document{

    private String letter;
}
