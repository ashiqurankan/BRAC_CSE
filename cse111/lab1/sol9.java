public class sol9{
        public static void identity(int[][] matrix){
            int N = matrix.length;
            boolean isIdentity = true;
    
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    if (i == j) {
                        if (matrix[i][j] != 1){
                            isIdentity = false;
                            break; 
                        }
                    } else {
                        if (matrix[i][j] != 0){
                            isIdentity = false; 
                            break; 
                        }
                    }
                }
                if (!isIdentity){
                    break; 
                }
            }
    
            if (isIdentity) {
                System.out.println("Identity matrix");
            } else {
                System.out.println("Not an Identity matrix");
            }
        }
    
        public static void main(String[] args){
            int[][] B = {
                {1, 0, 0, 1},
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1}
            };
            int [ ] [ ] A ={{1, 0, 0},
                                {0, 1, 0},
                                {0, 0, 1}};
    
            identity(B); 
            identity(A);
        }
    }