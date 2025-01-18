package CGPrograms;

public class odd_even {
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		String evens = "";
		String odds = "";
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0) evens+=arr[i]+" ";
			else odds+=arr[i]+" ";
		}
		System.out.println("Odds are "+odds);
		System.out.println("Evens are "+evens);
	}
}
