class Solution {
    //sliding window approach
    public int minimumRecolors(String blocks, int k) {
        int whitecount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                whitecount++;
            }
        }
        int mincount=whitecount;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){//entering
                whitecount++;
            }
            if(blocks.charAt(i-k)=='W'){//exiting
                whitecount--;
            }
            mincount=Math.min(mincount,whitecount);
        }
        return mincount;
    }
}
//sliding -> within the window 
//slide it to right entering , exiting
