package javaTesting;

public class BinarySearch {
	// 이진탐색
	/*
	 * 테이블의 요소
	 */

	class Entry {
		int key;
		Object data;

		/**
		 * 요소를 생성한다
		 * 
		 * @param key
		 * @param data
		 */
		public Entry(int key, Object data) {
			this.key = key;
			this.data = data;
		}
	}

	final static int MAX = 100;
	Entry[] table = new Entry[MAX];
	int n = 0;

	/*
	 * 키에 대응하는 값을 찾는다
	 * 
	 * @param key 키
	 * 
	 * @param data key에 대응하는 데이터. 키를 찾지 못하였으면 null을 반환한다.
	 * 
	 */

	public Object search (int key) {
		int low, high, middle;
		
		low = 0;
		high = n - 1;
		
		while (low <= high) {
			middle = (low + high) / 2;
			
		if ( key ==  table[middle].key)
			return table[middle].data;
		else if (key < table[middle].key) {
			high = middle - 1;
		}
		else low = middle + 1; //key > table[middle].key이다.	
		}
		return null;
	}
}





















