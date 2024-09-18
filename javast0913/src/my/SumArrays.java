package my;

public class SumArrays {

	private int[] nums;
	public SumArrays(int endPoint) {
		nums = new int[endPoint];
		for(int i=0; i<endPoint; i++) {
			nums[i] = i+1;
		}
	}
	public int totalSum() {
		int sum=0;
		for(int e : nums) {
			sum += e;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num = 10;
		SumArrays ref = new SumArrays(num);
		System.out.println("1부터 "+num+"합계:"+ref.totalSum());
	}
}
