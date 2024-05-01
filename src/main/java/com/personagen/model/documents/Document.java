package com.personagen.model.documents;

import lombok.Data;

@Data
public class Document {
    /**Full document String*/
    private String document;

    /**Only the number of the document*/
    private String number;
}
