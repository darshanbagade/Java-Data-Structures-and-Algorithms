public class E01_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //for merging arrays
        if(n!=0){
            int counter=0;
            for(int i=m; i<m+n ; i++){
                nums1[i]=nums2[counter];
                counter++;
            }
        }

        //sorting array using insertion sort
        for(int i=0 ; i<=n+m-2 ;i++){
            for(int j=i+1 ; j>0 ; j--){
                if(nums1[j-1]>nums1[j]){
                    swap(nums1,j,j-1);
                }
                else{
                    break;
                }
            }
        }        
    }
    //swap two elements in array
    public static void swap(int[] nums1, int a ,int b){
        int temp=nums1[a];
        nums1[a]=nums1[b];
        nums1[b]=temp;
    }
}
