package com.personagen.model.profiles;

import com.personagen.model.documents.Document;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Company extends Profile{
    private String creationDate;
}
