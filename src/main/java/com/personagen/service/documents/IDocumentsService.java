package com.personagen.service.documents;

import com.personagen.model.documents.Cif;
import com.personagen.model.documents.Nie;
import com.personagen.model.documents.Nif;

public interface IDocumentsService {

    Nif generateNif();

    Nie generateNie();

    Cif generateCif();


}
