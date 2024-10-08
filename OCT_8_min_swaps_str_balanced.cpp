class Solution {
public:
    int minSwaps(string s) {
        int opencount=0;
        int minswaps=0;
        for(char c:s){
            if(c=='['){
                opencount++;
            }
            else{
                opencount--;
            }
            minswaps=min(minswaps,opencount);
        }
        return (-minswaps+1)/2;
    }
};
