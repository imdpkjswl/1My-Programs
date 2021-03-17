import java.util.*;
// Sort the element in wave form.

class SortElementWaveForm {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(97);arr.add(45);arr.add(86);arr.add(112);arr.add(253);arr.add(23);arr.add(8);

        Collections.sort(arr, Collections.reverseOrder());

        for(int i=0;i<(arr.size()/2)*2/*Convert odd to even*/;i+=2){
            int tmp = arr.get(i);
            arr.set(i,arr.get(i+1));
            arr.set(i+1,tmp);
        }

        for(int val: arr){
            System.out.print(val+"  ");
        }

    }
}