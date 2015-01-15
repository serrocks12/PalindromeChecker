import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
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
public boolean palindrome(String word)
{
  String backward = "";
  String onlyLetters = ""; 
  String noCaps = word.toLowerCase();
  String place = noSpaces(word);
  for( int i = 0; i < place.length(); i++)
  {
     if(Character.isLetter(place.charAt(i)) == true )
        {
          onlyLetters = onlyLetters + place.charAt(i);
        }
  } 
for(int i = place.length()-1; i > 0; i--)
  {//your code here
    backward = backward + noCaps.charAt(i);
  }
  if(backward.equals(place))
    {
      return true;
    }
  else {return false;}
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

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
