class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        int store=0;
        for (int k=0;k<haystack.length();k++){
            
             if (haystack.length() - k < needle.length()) {
                return -1;
            }
            if (needle.charAt(0) == haystack.charAt(k)) {
                j=k;
                store=j;
                 if (needle.charAt(0) == haystack.charAt(j) && needle.length()==1) {
                    return store;
                }
                for (int i=1;i<needle.length();i++){
                    j++;
                   if (needle.charAt(i) != haystack.charAt(j)) {
                        break;
                    }
                   if (needle.charAt(i) == haystack.charAt(j) && i == needle.length() - 1) {
                        return store;
                    }
                }
            }
        }
    return -1;
    }
}
