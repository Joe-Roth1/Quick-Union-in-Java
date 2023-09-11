import java.util.*;

public class QuickUnion {
				 
private static int count; // number of connected compoents
private static int[] id;

	public QuickUnion(int N) {
		id = new int[N];
		for (int i=0; i<N; i++) {
			id[i] = i;
			count=N;


		}
}
               

                public static int getCount()
                {
            	return count;
                }
                

                public static int find(int i) {
                	while(id[i] != i) {
                		i=id[i];

               
                	}

                   return i;

                }             

                public static boolean connect(int p, int q) {

                                return find(p) == find(q);

                }
               
                public static int[] union(int p, int q) {
                	if(!connect(p,q)) {

                                int pid = find(p);

                                int qid = find(q);

                                id[pid]= qid;
                                count--;
                	}
                                return id;

                }
               
               

                public static void main(String[] args) {
                	Random rand = new Random();              	   
                	//int size = rand.nextInt(1000); //random array size
                	var qu = new QuickUnion(10);
                	int n = rand.nextInt(10); 
                	int m = rand.nextInt(10); 
                	System.out.println(Arrays.toString(id));
                	System.out.println(QuickUnion.connect(m,n));
                	union(m,n);
                	//union(2,9);
                //	union(6,4);
                	System.out.println(Arrays.toString(id));
                	System.out.println(QuickUnion.connect(m,n));                    
                    System.out.println(getCount());
                }             	

}