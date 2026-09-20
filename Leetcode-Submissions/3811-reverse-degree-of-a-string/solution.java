class Solution {
    public int reverseDegree(String s) {
      int result=0;
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        switch(ch){
            case 'a'-> result = result+((i+1)*26);
            case 'b'-> result = result+((i+1)*25);
            case 'c'-> result = result+((i+1)*24);
            case 'd'-> result = result+((i+1)*23);
            case 'e'-> result = result+((i+1)*22);
            case 'f'-> result = result+((i+1)*21);
            case 'g'-> result = result+((i+1)*20);
            case 'h'-> result = result+((i+1)*19);
            case 'i'-> result = result+((i+1)*18);
            case 'j'-> result = result+((i+1)*17);
            case 'k'-> result = result+((i+1)*16);
            case 'l'-> result = result+((i+1)*15);
            case 'm'-> result = result+((i+1)*14);
            case 'n'-> result = result+((i+1)*13);
            case 'o'-> result = result+((i+1)*12);
            case 'p'-> result = result+((i+1)*11);
            case 'q'-> result = result+((i+1)*10);
            case 'r'-> result = result+((i+1)*9);
            case 's'-> result = result+((i+1)*8);
            case 't'-> result = result+((i+1)*7);
            case 'u'-> result = result+((i+1)*6);
            case 'v'-> result = result+((i+1)*5);
            case 'w'-> result = result+((i+1)*4);
            case 'x'-> result = result+((i+1)*3);
            case 'y'-> result = result+((i+1)*2);
            case 'z'-> result = result+((i+1)*1);

        }
      }
        return result;
    }
}
