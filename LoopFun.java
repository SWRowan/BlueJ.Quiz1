 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
        int y = 1;
        Integer x = 1;
        
        while(y <= number){
           x *= y;
           y++;
        }
        
        return x;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] str = phrase.split(" ");
          String acro = "";
          
          for(int x = 0; x<= str.length-1; x++){
            acro += String.valueOf(str[x]).substring(0,1);
            }
          
          String acronym = acro.toUpperCase();
          
          return acronym;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String abc = "abcdefghijklmnopqrstuvwxyz";
          String encrypt = "defghijklmnopqrstuvwxyzabc";
          int x = 0;
          String secret = "";
          for(int t = 0; t <= abc.length()-1; t++){
             
              word.replace(word.charAt(t),encrypt.charAt(t));
            }
          
          
          /**while(x <= word.length()){
            for(int j = 0; j <= word.length(); j++){
                for(int i = 0; i <= word.length(); i++){
                    if(word.charAt(j) == abc.charAt(i)){
                        word += word.replace(word.charAt(j),abc.charAt(i));
                    }
                    x++;
                } */
          return secret;
      }
}
