// 11
class MyException extends Exception {
	// 12 : MyException class의 생성자를 만들어 줘야 한다. 생성자의 이름은 클래스 이름과 같다.
    public MyException(String msg) {
        super(msg);
    } 
} 

// 13
public class Error extends QuickCoding02 {

	// 14
	public static void MyError() throws MyException {

		// 15
		if(i >= 100) {
			throw(new MyException("두 자리 수를 넘길 수 없습니다"));
		}
		if(j >= 100) {
			throw(new MyException("두 자리 수를 넘길 수 없습니다"));
		}
		
	}
	
}


