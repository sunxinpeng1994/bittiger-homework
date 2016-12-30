public class MovingAverage{
	private Queue<Integer> que; 
	private	int windowSize;
	private int sum;
	/**Initialize your data structure here**/
	public MovingAverage(int size){
		que = new LinkedList<Integer>();
		windowSize = size;
		sum = 0;
	}

	public	double next(int val){
		if(que.windowSize == size){
			sum -= que.poll();
		}
		que.offer(val);
		sum += val;
		return (double)sum/que.windowSize;
	}
}