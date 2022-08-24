package tree;

public class StringCombination{
    public static final int C = 26;
    public static void main(String[] args){


    }
    private static void printSortedStrings(int k){
        printSortedStrings(k,"");
    }
    private static void printSortedStrings(int k, String prefix){
        if(k == 0){
            if(isInOrdere(prefix))
                System.out.println(prefix);
        } else{
            for(int i = 0; i<C; i++){
                char c = ithLetter(i);
                printSortedStrings(k-1,prefix + c);
            }
        }
    }
    private static boolean isInOrdere(String s){
        for(int i = 1; i < s.length(); i++){
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));
            if(prev > curr){
                return false;
            }
        }
        return true;
    }
    private static char ithLetter(int i){
        return (char) (((int)'a')+i);
    }
}

