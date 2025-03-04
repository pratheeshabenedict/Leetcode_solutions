class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}
//91 => 91%3 = 1 91/3=30 30%3=0
//46 => 46%3 = 1 46/3=15 15%3=0 15/3=5 5%3=2 remainder 2 so this will turn to
//2*3^2====false
//if we need to generate the powers of three then we can do this representation base representation => mod + divide
