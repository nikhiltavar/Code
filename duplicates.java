class duplicates{
    public static void main(String[] args) {
        int arr[]={2,3,1,2,3};
        int n= 5;

        for (int i=0;i<n;i++){
            for (int j =i+ 1;j<n;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                    // System.out.println(j);
                }
            }
            System.out.println("-");
        }
    }
}