package acadgild;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		for(int i=0; i<a.length; i++){
			for(int j=0; j<i+1; j++){
				System.out.print(a[j]);
			}
			System.out.println();
		}
		for(int xi=a.length-1; xi>0; xi--){
			for(int xj=0; xj<xi-1; xj++){
				System.out.print(a[xj]);
			}
			System.out.println();
		}
	}

}
