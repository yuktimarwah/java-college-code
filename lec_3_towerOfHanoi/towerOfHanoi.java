

public class towerOfHanoi {
    static void TOH(int n,char src,char helper,char dst){
        if(n==1){
            System.out.println("move disk 1 from " + src + " to " + dst);
            return;
        }

        // step1 : move (n-1)th disk from source to helper
        TOH(n-1, src,dst,helper);    
        
        // step 2: move (n)th disk from source to destinaltion
        System.out.println("move disk " + n + " from " + src + " to " + dst);

        // step 3 : move (n-1)th disk from  helper to destination
        TOH(n-1, helper,src, dst);
        
    }

    public static void main(String[] args) {
        TOH(4, 'A', 'B', 'C');
    }
}
