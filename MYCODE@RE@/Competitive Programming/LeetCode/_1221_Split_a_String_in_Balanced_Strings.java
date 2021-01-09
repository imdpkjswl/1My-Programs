class _1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int max = 0;
        int r = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                r++;
            } else {
                l++;
            }
            if (l == r) {
                max++;
                r = 0;
                l = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "RLRRRLLRLL";//"RLRRLLRLRL";
        System.out.println(balancedStringSplit(str));
    }
}