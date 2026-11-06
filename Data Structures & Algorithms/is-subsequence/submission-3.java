class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s == null || t == null){
            return false;
        }

        // Can't create subsequence if s is not smaller or equal to t.
        if(s.length() > t.length()){
            return false;
        }

        int sPointer = 0;
        int tPointer = 0;

        while(sPointer < s.length() && tPointer < t.length()){

            if(s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == s.length();

        // If we reached the end of s in our loop, then sPointer == s.length() should be true.
        // The end of s is only reached if all of it's letters were found in t in order.
        // If not, then sPointer should be less than length.

        // Example: s = node, t = neetcode.
        // sPointer = 0, tPointer = 0 on loop one.
        // n == n = true, so we increment both. 
        // sPointer = 1, tPointer = 1.
        // o == e = false. We only increment t.
        // sPointer = 1, tPointer = 2.
        // o == e = false.
        // sPointer = 1, tPointer = 3.
        // o == t = false. 
        // sPointer = 1, tPointer = 4.
        // o == c = false.
        // sPointer = 1, tPointer = 5.
        // o == true. Now we increment s along with t.
        // sPointer = 2, tPointer = 6.
        // d == d = true. 
        // sPointer = 3, tPointer = 7.
        // e == e = true.
        // sPointer = 4, tPointer = 8.
        // s.length() = 4. sPointer (and tPointer) now equals the length of s. 
        // We break out the loop, and return true.

        // Example: s = aec, t = abcde.
        // sPointer = 0, tPointer = 0 on loop one.
        // a == a = true, so we increment both. 
        // sPointer = 1, tPointer = 1.
        // e == b = false.
        // sPointer = 1, tPointer = 2.
        // e == c = false.
        // sPointer = 1, tPointer = 3.
        // e == d = false.
        // sPointer = 1, tPointer = 4.
        // e == e = true.
        // sPointer = 2, tPointer = 5.
        // c == .... end of loop! tPointer < t.length() == false, we reached the end of t. 
        // Since sPointer == 2, which is < s.length() of 3, we know we did not reach the end of s,
        // meaning we did not find a match for every character in s, in t, sequentially.
        // Thus, s is not a subsequence of t.
    }
}