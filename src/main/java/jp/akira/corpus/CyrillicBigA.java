package jp.akira.corpus;

public class CyrillicBigA extends CommonCyrillic {
    Character unicode_char = '\u0410';
    Character sjis_char = 0x8440;
    
    public String toString(){
    	return unicode_char.toString();
    }
}
