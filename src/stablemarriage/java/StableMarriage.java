package stablemarriage.java;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class StableMarriage {
    static File F_MEN, F_WOMEN;
    static Scanner S1, S2;
    static int numMen, numWomen;      	 	
    static String[]  men, women; 		   
    static String[]  mPartner, wPartner;       
    static boolean[] isWomanTaken, isManTaken;
    static LinkedList<String> John, Brian, George, Robert, Stephen;
    static LinkedList<String> Nancy, Joyce, Patricia, Anne, Susan;
    
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);       
        readFile("MarriageDataMen.txt");
        readFile("MarriageDataWomen.txt");
        System.out.println("Number of men and women: " + numMen);
        System.out.print("Names of the men: ");
        for (String men1 : men) {
            System.out.print(men1 + " ");
        }
        System.out.println();
        System.out.print("Names of the Women: ");
        for (String women1 : women) {
            System.out.print(women1 + " ");
        }
        System.out.println();
        System.out.println("Men Preferences: ");
        System.out.println(John + "\n" + Robert + "\n" + Brian + "\n" + 
                Stephen + "\n" + George);
        System.out.println("women Preferences: ");
        System.out.println(Nancy + "\n" + Joyce + "\n" + Patricia + "\n" + 
                Anne + "\n" + Susan);
        System.out.println();
        System.out.print("Choose who will propose(men or women): ");
        if (stdin.next().equalsIgnoreCase("men")){
            
        } else if (stdin.next().equalsIgnoreCase("women")){
            
        } 
    }
    public static void readFile(String MarriageData) throws Exception {
        F_MEN = new File("MarriageDataMen.txt");
        F_WOMEN = new File ("MarriageDataWomen.txt");
        S1 = new Scanner(F_MEN);
        S2 = new Scanner(F_WOMEN);
        
        while (S1.hasNextInt()){
            numMen = S1.nextInt();
        }
        men = new String[numMen];
        S1.nextLine();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            men[i] = S1.next();
        }
        John = new LinkedList<>();
        S1.nextLine();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            John.add(S1.next());
        }
        Robert = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            Robert.add(S1.next());
        }
        Brian = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            Brian.add(S1.next());
        }
        Stephen = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            Stephen.add(S1.next());
        }    
        George = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            George.add(S1.next());
        }
        while (S2.hasNextInt()){
            numWomen = S2.nextInt();
        }
        women = new String[numWomen];
        S2.nextLine();
        for (int i = 0; i < numWomen; i++){
            S2.hasNext();
            women[i] = S2.next();
        }   
        Nancy = new LinkedList<>();
        S2.nextLine();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            Nancy.add(S2.next());
        }
        Joyce = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            Joyce.add(S2.next());
        }   
        Patricia = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            Patricia.add(S2.next());
        }     
        Anne = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            Anne.add(S2.next());
        }
        Susan = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            Susan.add(S2.next());
        }   
    }
}
