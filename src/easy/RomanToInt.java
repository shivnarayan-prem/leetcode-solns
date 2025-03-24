package easy;

public class RomanToInt {
    public int romanToInt(String s) {
        int value = 0;
        int prev = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            int current = getInt(s.charAt(i));
            if (current < prev) value -= current;
            else value += current;
            prev = current;    
        }
        return value;
    }

    public int getInt(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInt roman = new RomanToInt();
        String s = "CDXLIII";
        System.out.println(roman.romanToInt(s));
    }
}
