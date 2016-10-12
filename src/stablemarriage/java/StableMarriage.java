package stablemarriage.java;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class StableMarriage {
    static File F_MEN, F_WOMEN;
    static Scanner S1, S2;
    static int numMen, numWomen;      	 	
    static String[]  men, women; 		   
    static LinkedList<String> male1, male2, male3, male4, male5;
    static LinkedList<String> woman1, woman2, woman3, woman4, woman5;
    
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in); 
        String choice;
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
        System.out.println("Men Preferences: " + "\n" + 
                male1 + "\n" + male4 + "\n" + male2 + "\n" + 
                male5 + "\n" + male3);
        System.out.println("Women Preferences: " + "\n" + 
                woman1 + "\n" + woman2 + "\n" + woman3 + "\n" + 
                woman4 + "\n" + woman5);
        System.out.println();
        System.out.print("Choose who will propose(men or women): ");
        choice = stdin.next();
        if (choice.equalsIgnoreCase("men")){
            
        } else if (choice.equalsIgnoreCase("women")) { 
            
        } else {
            System.out.println("Error, must choose men or women");
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
        male1 = new LinkedList<>();
        S1.nextLine();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            male1.add(S1.next());
        }
        male4 = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            male4.add(S1.next());
        }
        male2 = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            male2.add(S1.next());
        }  
        male5 = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            male5.add(S1.next());
        }  
        male3 = new LinkedList<>();
        S1.nextLine();
        S1.next();
        for (int i = 0; i < numMen; i++){
            S1.hasNext();
            male3.add(S1.next());
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
        woman1 = new LinkedList<>();
        S2.nextLine();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            woman1.add(S2.next());
        }    
        woman2 = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            woman2.add(S2.next());
        }
        woman3 = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            woman3.add(S2.next());
        }
        woman4 = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            woman4.add(S2.next());
        }
        woman5 = new LinkedList<>();
        S2.nextLine();
        S2.next();
        for (int i = 0; i < numMen; i++){
            S2.hasNext();
            woman5.add(S2.next());
        }   
    }
}
