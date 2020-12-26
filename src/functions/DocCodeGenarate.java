/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.sql.SQLException;

/**
 *
 * @author Sameera
 */
public class DocCodeGenarate {

    public static String getCode(String docType) throws SQLException {
     
        DocNumGenerator doc = new DocNumGenerator();

        doc.methodNumGen(docType);
        String id = doc.getDocChar();
        int docNumber = doc.getDocNumber();
        return id + docNumber;

    }

}
