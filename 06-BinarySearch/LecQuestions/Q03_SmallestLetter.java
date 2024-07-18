public class Q03_SmallestLetter {
    public static void main(String[] args) {
        char[] str = { 'c', 'd' , 'f'};
        char target = 'g';
        System.out.println(Smallest(str,target));
    }
    static char Smallest(char[] str , int target){
        int start =0 ;
        int end = str.length - 1 ;
        int mid;
        while(start<=end){
            mid = start + ( end-start )/2;
            if(str[mid]>target){
                end= mid -1 ;
            }
            else{
                start = mid+1;
            }

        }
        return str[start%str.length];

    }
}
