/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Vini
 */
public class Encounter {
    private Date encounterTimeStamp;
    private int encounterCount;
    private int count = 0;
    
    private Encounter() {
        count++;
        encounterCount = count;
    }
}
