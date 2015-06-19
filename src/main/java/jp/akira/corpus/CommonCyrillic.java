package jp.akira.corpus;

public class CommonCyrillic {
    Character unicode_char = '\u0040'; //'@'
    
    boolean isValid(char c){

	System.out.println(this.unicode_char);
	Character another = new Character(c);
	if(another.equals(unicode_char)){
	    return true;
	}
	return false;
    }
}
