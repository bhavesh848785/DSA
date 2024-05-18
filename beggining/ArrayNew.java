public class ArrayNew {
    
    public static void main(String[] args) {
        
        // int []marks = new int[5];
        // marks[0]=21;
        // marks[1]=22;
        // marks[2]=23;
        // marks[3]=24;
        // marks[4]=25;

        // for(int i =0; i<marks.length; i++)
        // {
        //     System.out.println("element at index " +i+ "is " +marks[i]);
        // }


        int [][]marks = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
