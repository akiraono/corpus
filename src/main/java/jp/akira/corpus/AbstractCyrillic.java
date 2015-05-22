package jp.akira.corpus;

abstract class AbstractCyrillic {
    static Character unicode_char = '\u0000';
    
    static boolean isValid(char c){
	Character another = new Character(c);
	if(another.equals(unicode_char)){
	    return true;
	}
	return false;
    }
}
