package jp.akira.corpus;

public class CyrillicSmallA {
    private static Character unicode_char = '\u0430';
    private static Character sjis_char = 0x8470;
    
    public String toString(){
	return unicode_char.toString();
    }
    public static boolean isValid(char c){
    	Character another = new Character(c);
    	if(another.equals(unicode_char)){
    	    return true;
    	}
    	return false;
    }
}
