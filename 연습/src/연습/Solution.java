package 연습;
// int[] answer = new int[2]; 이거 하면 뭐나오나 궁금해서 해봄
public class Solution {
	public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i]%2==0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }

        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5};
		Solution so = new Solution();
		for(int i=0; i <arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		int[] sc = new int[2];
		for(int i=0; i <sc.length; i++) {
			
			System.out.println(sc[i]);
		}
		
	}

}
