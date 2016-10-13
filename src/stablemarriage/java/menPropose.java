/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stablemarriage.java;
import java.util.*;
/**
 *
 * @author afreden2
 */
public class menPropose {
    static String[] mPartner, wPartner;
    static boolean[] isWomanTaken, isManTaken;
    static ArrayList<LinkedList> mPrefList;
    private static int engagedCount;
    static LinkedList w;
    
    public static void matchMen () {
        isManTaken = new boolean[StableMarriage.numMen];
        isWomanTaken = new boolean[StableMarriage.numWomen];
        
        for (int i = 0; i < StableMarriage.numMen; i++) {
            isWomanTaken[i] = false;
            isManTaken[i] = false;
        }
        
        mPrefList = new ArrayList<LinkedList>();
        
        mPrefList.add(StableMarriage.male1);
        mPrefList.add(StableMarriage.male2);
        mPrefList.add(StableMarriage.male3);
        mPrefList.add(StableMarriage.male4);
        mPrefList.add(StableMarriage.male5);
        
        while (engagedCount < StableMarriage.numMen) {
            int free;
            wPartner = new String[StableMarriage.numMen];
            for (free = 0; free < StableMarriage.numMen; free++) {
         
                for (int i = 0; engagedCount < 1 && (!isManTaken[free]) ; i++) {
                    
                    if (!isWomanTaken[i]) {
                        wPartner[0]= StableMarriage.male1.get(i);
                        System.out.println("Couples: ");
                        System.out.println(StableMarriage.men[0] + ", " + 
                                StableMarriage.male1.get(i));
                        isManTaken[free] = true;
                        isWomanTaken[i] = true;
                        engagedCount++;
                    }  
                }    
                for (int i = 0; engagedCount < 2 && !isManTaken[free]; i++) {
                    if (!isWomanTaken[free]) {
                        wPartner[1] = StableMarriage.male4.get(i);
                        System.out.println(StableMarriage.men[1] + ", " + 
                                wPartner[1]);
                        isManTaken[free] = true;
                        isWomanTaken[i] = true;
                        engagedCount++;
                    }
                } 
                for (int i = 0; engagedCount < 3 && !isManTaken[free]; i++) {
                    
                    if (!isWomanTaken[free]) {
                        wPartner[2] = StableMarriage.male2.get(i);
                        System.out.println(StableMarriage.men[2] + ", " +
                                wPartner[2]);
                        isManTaken[free] = true;
                        isWomanTaken[i] = true;
                        engagedCount++;
                    }
                } 
                for (int i = 0; engagedCount < 4 && !isManTaken[free]; i++) {
                    
                    if (!isWomanTaken[free]) {
                        wPartner[3] = StableMarriage.male5.get(i);
                        System.out.println(StableMarriage.men[3] + ", " +
                                wPartner[3]);
                        isManTaken[free] = true;
                        isWomanTaken[i] = true;
                        engagedCount++;
                    }
                } 
                for (int i = 0; engagedCount < 5 && !isManTaken[free]; i++) {
                    
                    if (!isWomanTaken[free] ) {
                        wPartner[4] = StableMarriage.male3.get(i);
                        System.out.println(StableMarriage.men[4] + ", " +
                                wPartner[4]);
                        isManTaken[free] = true;
                        isWomanTaken[i] = true;
                        engagedCount++;
                    }
                } 
            }
        }
    }
 }
