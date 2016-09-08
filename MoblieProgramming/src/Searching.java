// 이진탐색(Binary Search) 알고리즘은 탐색대상을 반으로 분할하고 분할해서 원하는 값을 찾는 탐색방법이다.
// 이 알고리즘을 적용하기 위해서는 배열에 저장된 데이터는 정렬되어 있어야한다는 것이다.
// 왜냐하면 중앙값을 확인하기 위해 분할을 하는데 이때 정렬이 안되어있으면 분할의 의미가 없어지기 때문이다.
// 아래 배열에서 data[0] = 2(배열의 인덱스 0은 2), data[8] = 23(배열의 인덱스 8은 23)
// 찾고자하는 숫자가 배열의 인덱스에 해당하는 숫자보다 크면 배열의 인덱스 해당 숫자 포함 왼쪽을 다 제외하고 search 작업 반복
// 반대로 찾고자하는 숫자가 배열의 인덱스에 해당하는 숫자보다 작으면 배열의 인덱스 해당 숫자 포함 오른쪽을 다 제외하고 search 작업 반복

public class Searching {

	public static void main(String[] args) {
		int data[] = {2,3,5,7,11,13,17,19,23};
		
		searching(19,data); // 메소드에 찾고자 하는 숫자와 배열을 집어 넣음 
	}
	
	public static void searching(int a, int data[]) { // 숫자와 배열을 변수로 받음
		int left = 0; // 배열의 인덱스 시작 초기 값 
		int right = data.length; // 배열의 인덱스 끝 초기 값 = 8
		int mid;
		
		while(right >= left) {
			mid = (right + left) / 2; // 나머지는 버리고 몫을 기준으로 생각한다. 
			
			if (a == data[mid]) {
				System.out.println(a + " is in the array with index value: " + mid);
				break;
			}
			if (a < data[mid]) {
				right = mid-1;
			} else {
				left = mid +1;
			}
		}
	}

}
