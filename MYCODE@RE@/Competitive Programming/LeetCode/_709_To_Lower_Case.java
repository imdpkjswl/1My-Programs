class _709_To_Lower_Case {
	public static String toLowerCase(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			int tmp = (int)str.charAt(i);
			if (tmp <= 91 && tmp >= 65) {
				res += (char)(tmp + 32);
			} else {
				res += str.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String str = " HeLlO woRlD ";
		//System.out.println(str.toLowerCase());
		String res = toLowerCase(str);
		System.out.println(res);
	}
}