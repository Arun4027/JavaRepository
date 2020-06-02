package com.roman;

/*
 * @author Arun Kumar A
 * 
 * @version 1.0
 * 
 * implementation of Roman Interface
 */

public class RomanConverter {

	   public String intToRoman(long i) {
		   
		      if (i > 3999999L) {
		         System.out.println("The value cannot exceed 3,999,999");
		         return "Error";
		      } else {
		         String Roman = "";

		         while(i > 0L) {
		        	 
		            if (i >= 1000000L) {
		               Roman = Roman + "_M";
		               i -= 1000000L;
		               continue;
		            } 
		            if (i >= 900000L) {
		               Roman = Roman + "_C_M";
		               i -= 900000L;
		               continue;
		            } 
		            if (i >= 500000L) {
		               Roman = Roman + "_D";
		               i -= 500000L;
		               continue;
		            } 
		            if (i >= 400000L) {
		               Roman = Roman + "_C_D";
		               i -= 400000L;
		               continue;
		            } 
		            if (i >= 100000L) {
		               Roman = Roman + "_C";
		               i -= 100000L;
		               continue;
		            } 
		            if (i >= 90000L) {
		               Roman = Roman + "_X_C";
		               i -= 90000L;
		               continue;
		            } 
		            if (i >= 50000L) {
		               Roman = Roman + "_L";
		               i -= 50000L;
		               continue;
		            } 
		            if (i >= 40000L) {
		               Roman = Roman + "_X_L";
		               i -= 40000L;
		               continue;
		            } 
		            if (i >= 10000L) {
		               Roman = Roman + "_X";
		               i -= 10000L;
		               continue;
		            } 
		            if (i >= 9000L) {
		               Roman = Roman + "_I_X";
		               i -= 9000L;
		               continue;
		            } 
		            if (i >= 5000L) {
		               Roman = Roman + "_V";
		               i -= 5000L;
		               continue;
		            } 
		            if (i >= 4000L) {
		               Roman = Roman + "_I_V";
		               i -= 4000L;
		               continue;
		            } 
		            if (i >= 1000L) {
		               Roman = Roman + "M";
		               i -= 1000L;
		               continue;
		            } 
		            if (i >= 900L) {
		               Roman = Roman + "CM";
		               i -= 900L;
		               continue;
		            } 
		            if (i >= 500L) {
		               Roman = Roman + "D";
		               i -= 500L;
		               continue;
		            } 
		            if (i >= 400L) {
		               Roman = Roman + "CD";
		               i -= 400L;
		            } 
		            if (i >= 100L) {
		               Roman = Roman + "C";
		               i -= 100L;
		               continue;
		            } 
		            if (i >= 90L) {
		               Roman = Roman + "XC";
		               i -= 90L;
		               continue;
		            } 
		            if (i >= 50L) {
		               Roman = Roman + "L";
		               i -= 50L;
		               continue;
		            } 
		            if (i >= 40L) {
		               Roman = Roman + "XL";
		               i -= 40L;
		               continue;
		            } 
		            if (i >= 10L) {
		               Roman = Roman + "X";
		               i -= 10L;
		               continue;
		            } 
		            if (i == 9L) {
		               Roman = Roman + "IX";
		               i -= 9L;
		               continue;
		            } 
		            if (i >= 5L) {
		               Roman = Roman + "V";
		               i -= 5L;
		               continue;
		            } 
		            if (i == 4L) {
		               Roman = Roman + "IV";
		               i -= 4L;
		               continue;
		            } 
		            if (i >= 1L) {
		               Roman = Roman + "I";
		               --i;
		               continue;
		            }
		         }

		         return Roman;
		      }
		   }
	
	   
	   public int romanToInt(String s) {
		   
		      int val = 0;
		      if (!s.matches("[I,V,X,L,C,D,M,_]+")) {
		         System.out.println("Please Enter a valid input..!");
		         return 0;
		      } else {
		         int i = 0;
		         
		            while(i < s.length()) {
		            	
		               String str = null;
		               
		               if (i + 3 <= s.length()) {
		            	   
		                  if (i + 4 > s.length()) {
		                     str = s;
		                  } else {
		                     str = s.substring(i, i + 4);
		                  }

		                  switch(str) {
		                  case "_C_M":
		                        val += 900000;
		                        i += 4;
		                        continue;
		                  case "_C_D":
		                        val += 400000;
		                        i += 4;
		                        continue;
		                  case "_X_C":
		                        val += 90000;
		                        i += 4;
		                        continue;
		                  case "_X_L":
		                        val += 40000;
		                        i += 4;
		                        continue;
		                  case "_I_X":
		                        val += 9000;
		                        i += 4;
		                        continue;
		                  case "_I_V":
		                        val += 4000;
		                        i += 4;
		                        continue;
		                     }
		                  }

		               if (i + 1 <= s.length()) {
		            	   
		                  if (i + 2 > s.length()) {
		                     str = s;
		                  } else {
		                     str = s.substring(i, i + 2);
		                  }

		                  switch(str) {

		                  case "_M":
		                        val += 1000000;
		                        i += 2;
		                        continue;
		                  case "_D":
		                        val += 500000;
		                        i += 2;
		                        continue;
		                  case "_C":
		                        val += 100000;
		                        i += 2;
		                        continue;
		                  case "_L":
		                        val += 50000;
		                        i += 2;
		                        continue;
		                  case "_X":
		                        val += 10000;
		                        i += 2;
		                        continue;
		                  case "_V":
		                        val += 5000;
		                        i += 2;
		                        continue;
		                  case "_I":
		                        val += 1000;
		                        i += 2;
		                        continue;
		                  case "CM":
		                        val += 900;
		                        i += 2;
		                        continue;
		                  case "CD":
		                        val += 400;
		                        i += 2;
		                        continue;
		                  case "XC":
		                        val += 90;
		                        i += 2;
		                        continue;
		                  case "XL":
		                        val += 40;
		                        i += 2;
		                        continue;
		                  case "IX":
		                        val += 9;
		                        i += 2;
		                        continue;
		                  case "IV":
		                        val += 4;
		                        i += 2;
		                        continue;
		                     }
		                  }

		               switch(s.substring(i, i + 1)) {
		               
		               case "M":
		                     val += 1000;
		                     i++;
		                     continue;
		               case "D":
			                  val += 500;
			                  i++;
			                  continue;
		               case "C":
			                  val += 100;
			                  i++;
			                  continue;
		               case "L":
		                     val += 50;
		                     i++;
		                     continue;
		               case "X":
		                     val += 10;
		                     i++;
		                     continue;
		               case "V":
		                     val += 5;
		                     i++;
		                     continue;
		               case "I":
		                     ++val;
		                     i++;
		                     continue;
		                  }
		               }

		               ++i;
		            }

		            return val;
		      
		   }
}
