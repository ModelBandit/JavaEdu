package List;

public class MyList {
	Node node;

	public MyList() {
		node = null;
	}

	// 받아온 인자를 추가하는 함수
	public void append(int num) {
		if (node == null) {
			node = new Node(num);
			return;
		}

		Node otherNode = node;
		while (otherNode.next != null) {
			if (otherNode.next.value > num) {
				Node newNode = new Node(num, otherNode.next);
				otherNode.next = newNode;
				return;
			}
			otherNode = otherNode.next;
		}
		otherNode.next = new Node(num);
	}

	// 모든 함수를 출력
	public void printAll() {
		if (node == null) {
			System.out.println("빈 리스트");
			return;
		}

		Node other = node;
		while (other != null) {
			System.out.println(other.value);
			other = other.next;
		}

		System.out.println("--------------------------------");
	}

	public void search(int num) {
		if (node == null)
			return;

		Node otherNode = node;
		while (otherNode.next != null) {
			if (otherNode.next.value == num) {
				System.out.println("찾음: " + otherNode.value);
				return;
			}
			otherNode = otherNode.next;
		}

	}

	// 노드 지우는 함수
	public void delete(int num) {
		if (node == null)
			return;

		Node otherNode = node;
		Node prev = null;
		Node next = otherNode.next;

		while (otherNode != null) {
			if (otherNode.value == num) {
				System.out.println(otherNode.value + " 삭제");
				if (prev == null && next == null) {
					node = null;
					return;
				} else if (prev == null) {
					node.value = node.next.value;
					node = node.next;
				} else {
					prev.next = next;
				}
			}
			prev = otherNode;
			otherNode = otherNode.next;
			if (otherNode != null)
				next = otherNode.next;
		}
	}
}
