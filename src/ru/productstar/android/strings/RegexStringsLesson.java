package ru.productstar.android.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStringsLesson {
 	public static void main(String[] args) {
// 		Integer I = 1703;
//		String a = "Петром Первым";
//		String[] arrayNames = {"Санкт-Петербург", "Петроград", "Ленинград"};
//		String b = "Питер";
//		
//		String maket =   "Санкт-Петербург был основан в %d году %s. "
//                       + "За свою историю он носил имена: %s, %s, %s. "
//                       + "Сейчас многие зовут его просто “%s”.";
//		System.out.println(String.format(maket, 
//		                                 I, a, (Object[])arrayNames, b));
 	    
 	   String[] samples = {"dgbvawq", "m,kl;po", "cbcbcbc", "z_qwertyuiop_z"}; // false, false, true, true

       String reg = "(.).*\\1";

       Pattern p = Pattern.compile(reg);

       for(String s : samples){
           Matcher m = p.matcher(s);
           System.out.println(m.matches());
           while (m.find()) {
               System.out.println(m.group());
           }
       }
 	}
}
