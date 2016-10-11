package stablemarriage.java;
public class PreferenceList {
    public StringNode first;
    public StringNode next;  
    public StringNode last;
    
    public PreferenceList (){
        first = null;  
        next  = null;  
        last  = null;
    }
    public void add (String S){
        StringNode temp = new StringNode(S);

        if (first == null) {
            first = next = last = temp;
        } else {
            last.link = temp;
            last = temp;
        }       
    }
   public String nextPreference(){
    String result;
    result = next.name;
    next   = next.link;
    return result;
   }
}
