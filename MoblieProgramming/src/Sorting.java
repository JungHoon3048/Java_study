// BubbleSorting : 배열의 인접한 원소간 크기를 비교하여 원소가 크면 자리를 바꿈 => 가장 큰 원소가 맨 뒤에, 가장 작은 원소가 가장 앞에 위치함

public class Sorting {
	
	public static void main(String[] args) {
		int data[] = {3,2,7,5,13,11};
		
		System.out.println("Original data order");
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");

		System.out.println("\n");
		System.out.println("After Sorting");
		
		sorting(data, data.length); // 메소드에 배열과 배열 크기를 집어넣음
	}
	
	public static void sorting(int a[], int b) { // 배열과 배열크기를 변수로 받음
		int temp; // 배열의 원소를 교환하기 위한 임시변수
		for (int i=b; i>0; i--){
			for (int j=1; j<b; j++){
				if(a[j-1] > a[j]) { // a[j-1]가  a[j]보다 크면 데이터 교환
					temp = a[j-1]; // 임시변수 temp에 a[j-1] 대입
					a[j-1] = a[j]; // a[j-1]에  a[j] 대입
					a[j] = temp; // a[j]에 temp 데이터 대입
				}
			}
		}
	for (int x=0; x<a.length; x++){ // BubbleSorting 후 출력
		System.out.print(a[x] + " ");
	}
	}
}
