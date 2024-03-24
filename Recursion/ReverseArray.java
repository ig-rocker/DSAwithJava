class ReverseArray{
    public static void main(String args[]){
        int[] arr={2,5,53,23,65,63,97,12,9,1};
        reverseArray(0,arr.length-1,arr);
    }
    static void reverseArray(int l, int r,int[] Data){
       if(l>r){
        System.out.println("Array after reversing: ");
        for(int i=0;i<Data.length;i++){
            System.out.println(Data[i]);
        }
        return;
       }

       int c=Data[l];
       Data[l]=Data[r];
       Data[r]=c;       
       reverseArray(l+1, r-1, Data);
    }
}