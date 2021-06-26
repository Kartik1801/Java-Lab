class pattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==(n)/2)
                    System.out.printf("*");
                else if(j==0||j==n-1)
                    System.out.printf("*");
                else 
                  System.out.printf(" ");
            }
            System.out.printf("\n");
        }
            
        }
    }

