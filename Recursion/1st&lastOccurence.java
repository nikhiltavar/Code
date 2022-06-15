package Recursion;

class firstlastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void firstAndLast(String s, int idx, char ele) {
        if (idx==s.length()){
            System.out.println(first + " " + last);
            return;
        }
        char c = s.charAt(idx);
        if (c==ele){
            if (first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        
        firstAndLast(s,idx+1,ele);
    }
    public static void main(String[] args) {
        String s = "abaacdatefaah";
        char c = 'a';
        

        firstAndLast(s,0,c);



        // Without resursion

        // int first = -1;
        // int last = -1;
        // for (int i = 0; i <s.length(); i++){
        //     if(s.charAt(i)==c){
        //         if (first == -1){
        //             first = i;
        //         }else {
        //             last = i;
        //         }
        //     }
            

        // }
        // System.out.println(first);
        // System.out.println(last);
    }
    
}
