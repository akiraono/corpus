public class CyrillicChar {
    
    private static Character g = '\u0413';
    
    // UNICODE
    private static Character[] unicode_capson  = {'\u0410','\u0411','\u0412','\u0413','\u0414','\u0415','\u0401','\u0416','\u0417','\u0418','\u0419','\u041a','\u041b','\u041c','\u041d','\u041e','\u041f','\u0420','\u0421','\u0422','\u0423','\u0424','\u0425','\u0426','\u0427','\u0428','\u0429','\u042a','\u042b','\u042c','\u042d','\u042e','\u042f' };
    private static Character[] unicode_capsoff = {'\u0430','\u0431','\u0432','\u0433','\u0434','\u0435','\u0451','\u0436','\u0437','\u0438','\u0439','\u043a','\u043b','\u043c','\u043d','\u043e','\u043f','\u0440','\u0441','\u0442','\u0443','\u0444','\u0445','\u0446','\u0447','\u0448','\u0449','\u044a','\u044b','\u044c','\u044d','\u044e','\u044f' };

    // SJIS
    private static Character[] sjis_capson = {0x8440,0x8441,0x8442,0x8443,0x8444,0x8445,0x8446,0x8447,0x8448,0x8449,0x844a,0x844b,0x844c,0x844d,0x844e,0x844f,0x8450,0x8451,0x8452,0x8453,0x8454,0x8455,0x8456,0x8457,0x8458,0x8459,0x845a,0x845b,0x845c,0x845d,0x845e,0x845f,0x8460};
    private static Character[] sjis_capsoff = {0x8470,0x8471,0x8472,0x8473,0x8474,0x8475,0x8476,0x8477,0x8478,0x8479,0x847a,0x847b,0x847c,0x847d,0x847e,0x8480,0x8481,0x8482,0x8483,0x8484,0x8485,0x8486,0x8487,0x8488,0x8489,0x848a,0x848b,0x848c,0x848d,0x848e,0x848f,0x8490,0x8491};
    
    public static void main(String[] args){
	CyrillicChar cyrillic = new CyrillicChar();
	cyrillic.print_list();
    }

    private void print_list(){
	for(int i=0; i<unicode_capson.length; i++){
	    System.out.print(unicode_capson[i]);
	}
	System.out.print("\n");
	for(int i=0; i<unicode_capsoff.length; i++){
	    System.out.print(unicode_capsoff[i]);
	}
	System.out.print("\n");
    }
    public int unicode2sjis(){}
    public 
}
