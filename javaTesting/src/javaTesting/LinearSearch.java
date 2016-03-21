package javaTesting;

public class LinearSearch {
	// 선형탐
	class Entry {
		int key; //
		Object data;

		/**
		 * 엔트리를 생성한다.
		 * 
		 * @param key
		 *            키
		 * @param data
		 *            key에 대응하는 데이
		 */
		public Entry(int key, Object data) {
			this.key = key;
			this.data = data;
		}
	}

	final static int MAX = 100; // 테이블 최대 개수
	Entry[] table = new Entry[MAX]; // 데이터를 저장할 배

	int n = 0; // table에 등록되어 있는 데이터의 개수

	/*
	 * 데이터를 등록한다
	 * 
	 * @param key 키
	 * 
	 * @param data key에 대응하는 데이터
	 */

	public void add(int key, Object data) {
		if (n >= MAX) {
			System.err.println("데이터의 개수가 너무 많습니다.");
			System.exit(1); // 상태코드1은 종
		}
		table[n++] = new Entry(key, data);
	}

	/*
	 * key에 대응하는 데이터를 찾는다
	 * 
	 * @param key 키
	 * 
	 * @param data 키에 대응하는 데이터. 키가 발견되지 않았으면 null을 반
	 */
	public Object search(int key) {
		int i;

		i = 0;

		while (i < n) {
			if (table[i].key == key) //발견했다.
				return (table[i].data);
			i++;
		}
		return null; //발견하지 못했다.
	}
}
