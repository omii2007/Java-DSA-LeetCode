class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int lettersFound = 0;

        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.charAt(i) - 'a';

            if (!seen[index]) {
                seen[index] = true;
                lettersFound++;

                if (lettersFound == 26) {
                    return true;
                }
            }
        }

        return false;
    }
}


// class Solution {
//     public boolean checkIfPangram(String sentence) {

//         boolean[] ans = new boolean[26];

//         for(int i=0; i<sentence.length(); i++){

//             int index = sentence.charAt(i) - 'a';

//             ans[index] = true;


//         }

//         for(int i=0; i<26; i++){

//             if(!ans[i]){
//                 return false;
//             }


//         }

//         return true;

        
//     }
// }