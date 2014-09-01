/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.electricfire.shadowdetectiontools;

import com.electricfire.shadowdetectiontools.filetools.BinaryToText;
import com.electricfire.shadowdetectiontools.filetools.CreateCSVFile;

/**
 *
 * @author marko
 */
public class ShadowDetectionTools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mode = args[0];
        if (mode.compareTo("-btt") == 0){
            try{
                BinaryToText.convert(args[1], args[2]);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (mode.compareTo("-makelist") == 0){
            try{
                CreateCSVFile.createCSV(args[1], args[2]);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    
}