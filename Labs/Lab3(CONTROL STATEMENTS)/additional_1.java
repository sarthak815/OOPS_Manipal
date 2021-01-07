public class additional_1 {
    public static void main(String[] args) {
        System.out.println("Duplication of digits allowed");
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                for(int k=1;k<5;k++){
                    for(int l=1;l<5;l++)
                       
                        System.out.println(" " + (i*1000 + j*100 + k*10 + l));
                }
            }
        }
        System.out.println("Duplication not allowed");
           for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                for(int k=1;k<5;k++){
                    for(int l=1;l<5;l++)
                        if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
                            System.out.println(" " + (i*1000 + j*100 + k*10 + l));
                }
            }
        }

    }
}
