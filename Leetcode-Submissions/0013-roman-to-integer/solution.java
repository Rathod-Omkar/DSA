class Solution {
    public int romanToInt(String s) {
        
            int one=0;
		String four = "IV";
		String nine = "IX";
		String fourty = "XL";
		String ninty = "XC";
		String fourHund = "CD";
		String nineHund = "CM";
		String m ="";
		
        for(int i=0;i<s.length();i++){
        	if(i!=s.length()-1) {
        		m=""+s.charAt(i) + s.charAt(i+1);	
        	}
        	
        	if(m.matches(four)|| m.matches(nine)|| m.matches(fourty)|| m.matches(ninty)|| m.matches(fourHund)|| m.matches(nineHund))
        	{
        		if(s.charAt(i)=='I' && s.charAt(i+1)=='V')
                {
                	one+=4;
                	i++;
                }
        		else if(s.charAt(i)=='I' && s.charAt(i+1)=='X')
                {
                	one+=9;
                	i++;
                }
        		else if(s.charAt(i)=='X'&& s.charAt(i+1)=='L')
                {
                	one+=40;
                	i++;
                }
        		else if(s.charAt(i)=='X'&& s.charAt(i+1)=='C')
                {
                	one+=90;
                	i++;
                }
        		else if(s.charAt(i)=='C'&& s.charAt(i+1)=='D')
                {
                	one+=400;
                	i++;
                }
        		else if(s.charAt(i)=='C'&& s.charAt(i+1)=='M')
                {
                	one+=900;
                	i++;
                }
                m="";
        	}
        	else {
        		
        		if(s.charAt(i)=='I')
                {
                	one++;
                }
                
                else if(s.charAt(i)=='V')
                {
                	one+=5;
                }
                else if(s.charAt(i)=='X')
                {
                	one+=10;
                }
            
                else if(s.charAt(i)=='L')
                {
                	one+=50;
                }
                else if(s.charAt(i)=='C')
                {
                	one+=100;
                }
                
                
                else if(s.charAt(i)=='D')
                {
                	one+=500;
                }
                else if(s.charAt(i)=='M')
                {
                	one+=1000;
                }
        	}
        	System.out.println(one);

        }
		return one;

        
    }
}
