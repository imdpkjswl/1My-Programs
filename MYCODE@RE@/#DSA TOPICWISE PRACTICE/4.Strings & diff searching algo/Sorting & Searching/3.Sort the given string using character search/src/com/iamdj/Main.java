package com.iamdj;

// Java implementation to sort the given string without using any sorting technique
class Main {

    // function to sort the given string without using any sorting technique
    static String sortString(String str, int n) {

        // to store the final sorted string
        String new_str = "";

        // for each character 'i'
        for (int i = 'a'; i <= 'z'; i++) // suppose string contain only lower case 
            // if character 'i' is present at a particular index then add character 'i' to 'new_str'
            for (int j = 0; j < n; j++)
                if (str.charAt(j) == i)
                    new_str += str.charAt(j);

        // required final sorted string
        return new_str;
    }

    // Driver code
    public static void main(String[] args) {

        String str = "ilikeyousmile";
        int n = str.length();

        System.out.print(sortString(str, n));
    }
}
