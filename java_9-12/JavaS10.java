public class JavaS10 {

    public static void main(String[] args) {
        System.out.println("REPEAT Example");
        String string="This is sonali raghuwanshi!!";
        System.out.println(string.repeat(3));
        
        System.out.println("\nTRIM EXAMPLE");
        String whiteSpaceString="    \n Hello There \n";
        System.out.println(whiteSpaceString.trim());
        
        System.out.println("\nSTRIP EXAMPLE");
        String unicodeSpaceString="\u2005\u2005hello There    \n";
        System.out.println("Before Strip="+unicodeSpaceString);
        System.out.println("After Strip="+whiteSpaceString.strip());
        
        System.out.println("\nISBLANK Example");
        String isBlankString=" ";
        System.out.println(isBlankString.isBlank());
        
        
        System.out.println("\nISBLANK Example");
        String s="This is my Sentence.";
        System.out.println(s);
        s=s.indent(10);
        System.out.println(s);
        s=s.indent(-5);
        System.out.println(s);
        
        System.out.println("\nTRANSFORM Example");
        String transformMethod=string.transform(stringTemp->new    StringBuilder(stringTemp).reverse().toString());
        System.out.println(transformMethod);
        
        
        System.out.println("\nSTRIP INDENT Example");
        String stripString="    Hello There Strip the Indent";
        stripString=stripString.stripIndent();
        System.out.println(stripString);
        
        System.out.println("\nTRANSLATE ESCAPES Example");
        String str="\"Hello\\nThere\"";
        System.out.println(str.translateEscapes());
        
        
        System.out.println("\nFORMATED STRING Example");
        System.out.println(String.format("I am Sonali %s","raghuwanshi"));
        
    }

}

