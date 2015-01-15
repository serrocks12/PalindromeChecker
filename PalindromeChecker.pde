void setup()
{
  String lines[] = loadStrings("Palindrome.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++)
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
boolean palindrome(String word)
{
  
  word = word.toLowerCase();
  word = noSpaces(word);
  word = isLetters(word);
  for(int i = 0; i <  word.length(); i++)
 {
  if(word.charAt(i) != word.charAt(word.length()-(i+1)))
    {
      return false;
    }
  
 } 
 return true;
 
}

public String noSpaces(String word)
{
  String place = "";
  for( int i = 0; i < word.length(); i++)
  {
     if(word.charAt(i) != ' ')
        {
          place = place + word.charAt(i);
        }
      
  } 
  return place  ;    
}
public String isLetters(String word)
{
 String numLetters = "";
 for(int i = 0; i < word.length(); i++)
 {
   if( Character.isLetter(word.charAt(i)) == true)
   { 
     numLetters = numLetters + word.charAt(i);
   }
 }  
 return numLetters;
}
