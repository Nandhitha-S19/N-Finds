import java.util.ArrayList;

public class Asteroids {
    public static ArrayList<Integer> AfterCollision(int[] a){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < a.length;i++){

            if(a[i] >0){
                list.add(a[i]);
            }
            else{

                while(!list.isEmpty() &&( list.getLast() >0 )&& (list.getLast() < Math.abs(a[i]))){
                    list.removeLast();
                }
                if(list.isEmpty() && a[i] <0 ){
                    list.add(a[i]);
                }
                else if(!list.isEmpty() && (list.getLast() == Math.abs(a[i]))){
                    list.removeLast();
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {3,5,-6,2,-1,4};
        ArrayList<Integer> list = AfterCollision(a);
        System.out.println(list);
    }
}
