public class Vowel {
    public static void main(String[] args) {
        System.out.println("the string Hello contains vowel: "+ isStringContainVowel("hello"));
        System.out.println("the string qwrty contains vowel: "+ isStringContainVowel("qwrty"));
    }
    public static boolean isStringContainVowel(String str){
        return str.matches(".*[aeiou].*");
    }

}
