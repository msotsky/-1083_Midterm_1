public class test {

    
    public static int triple(int[][] arr) throws SetNotFoundException {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(j+2 < arr[i].length){
                    if (arr[i][j] == arr[i][j+1] && arr[i][j+1] == arr[i][j+2]){
                        return arr[i][j];
                    }
                }
                else if (i+2 < arr.length){
                    if (arr[i][j] == arr[i+1][j] && arr[i+1][j] == arr[i+2][j]){
                        return arr[i][j];
                    }
                }
            }
        }
        return 0;

    }

    public static void swapMaxs(int[] a1, int[] a2){

        int x1 = a1[0];
        int x2 = a2[0];
        int i1 = 1;
        int i2 = 1;

        for(; i1 < a1.length; i1++){
            if(a1[i1] > x1){
                x1 = a1[i1];
                break;
            }
        }
        for(; i2 < a2.length; i2++){
            if(a2[i2] > x2){
                x2 = a2[i2];
                break;
            }
        }

        a1[i1] = x2;
        a2[i2] = x1;

        System.out.println(a1[5]);
        System.out.println(a2[3]);

    }
    /*

        public int findArea(){
        int count = 0;
        if(!FindValve())
            return count;
        count++;
        for(int i = 1; i < this.cross.length; i++){
            for(int j = 0; j < this.cross[i].length; j++){
                if(this.cross[i][j] == 0 && checkNeighbors(i,j)){
                    this.cross[i][j] = 3;
                    count++;
                    j = 0;
                    i = 0;
                }
            }
        }
        return count;
    }
    */
    public static void main(String[] args) throws Exception {
        int arr[][] = {{1,3,2,1},{2,3,1,3},{1,1,1,2}};
        System.out.println(triple(arr));

        int[] a = {12,7,5,-4,18,22,0};
        int[] b = {12,-2,1,24,8, 16};

        swapMaxs(a,b);

        System.out.println(a[5]);
        System.out.println(b[3]);

    }
}
