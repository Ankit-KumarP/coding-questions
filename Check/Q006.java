package Check;

public record Q006() {
    // function
    static int[] constructDistancedSequence(int n) {
        int size = 2 * n -1;
        int rtn [] = new int [size];
        boolean flag [] = new boolean[n+1];
         flag[0] = true;

        // 1st
        for(int i = 0;i<size;i++){
            if(rtn[i] == 0){
                for(int j = 3;j>1;j--){
                    if(!flag[j] && rtn[i+j] == 0){
                        flag[j] = true;
                        rtn[i] = j;
                        rtn[i+j] = j;
                        break;
                    }
                }
            }
           
        }

        // 2nd
        for(int i = 0;i<size;i++) {
            if(rtn[i] == 0){
                rtn[i] = 1;
                return rtn;
            }
           
        }
        return rtn;
    }

    static void print(int [] ans){
        for(int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }
     static void printB(boolean [] ans){
        for(boolean b : ans){
            System.out.print(b + " ");
        }
        System.out.println();
    }
    public static  void main(String[] args){
        int [] ans = constructDistancedSequence(3);
        print(ans);
        System.out.println("Hlo");
    }
}
