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
            for (free = 0; free < StableMarriage.numMen; free++) 
                if (!isManTaken[free])
                    break;
            for (int i = 0; i < StableMarriage.numMen && !isManTaken[free]; i++) {
                wPartner = new String[StableMarriage.numMen];
                if (!isWomanTaken[i]) {
                    wPartner[i] = StableMarriage.male1.get(i);
                    System.out.println(StableMarriage.male1.get(i));
                    isManTaken[free] = true;
                    engagedCount++;
                }
                
            }    
        }
        
        int j =0;
        String m; 
        
        
        /*
        while(isManTaken[j] == false) {
            m = StableMarriage.men[j];
            w = mPrefList.get(j);
            System.out.println(w);
            
            if(isWomanTaken[j] = false) {
                mPartner[j] = (String) w.getFirst();
                isManTaken[j] = true;
                System.out.println(mPartner[j]);
            }
        } */
    }
 }
