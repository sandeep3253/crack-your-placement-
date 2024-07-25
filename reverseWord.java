public class reverseWord {
    public String reverseWords(String s) {
        char[] temp = new char[s.length()];
        char[] final_ = new char[s.length()];
        int i, k, m = 0;
        i = s.length() - 1;  
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--; 
            }
            if (i < 0) break;

            k = 0;
            while (i >= 0 && s.charAt(i) != ' ') {
                temp[k] = s.charAt(i);  
                i--;
                k++;
            }
            while (k > 0) {
                final_[m] = temp[--k];  
                m++;
            }
            if (m < s.length()) {
                final_[m] = ' ';  
                m++;
            }
        }
        if (m > 0 && final_[m - 1] == ' ') {
            m--;
        }
        return new String(final_, 0, m);
    }
}

