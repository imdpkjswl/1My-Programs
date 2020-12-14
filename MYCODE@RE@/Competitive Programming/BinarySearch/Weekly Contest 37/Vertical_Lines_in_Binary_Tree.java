/*
Intuition
If we DFS through the tree, we can maintain for each node its horizontal offset.
We can track all of these horizontal offsets in a hash table and then return the
final size of the hash table.

Implementation:
Our dfs function tracks, for the current node, its horizontal offset in the
parameter  d.  When we go to the left, the horizontal offset decreases by 1,
and when we go to the right, the horizontal offset increases by one. We throw
all of these values into our unordered_set and then return the size of the set
at the end.

Time Complexity:
The DFS takes linear time and the unordered(hash) set operations take constant
time each, for a time complexity of O(N).

Space Complexity:
The answer can be N, so the space complexity is O(N).
*/



import java.util.HashSet;

//Vertical Lines in Binary Tree
class Tree {
	int val;
	Tree left, right;

	Tree(int item) {
		val = item;
		left = right = null;
	}
}

class Vertical_Lines_in_Binary_Tree {
	HashSet<Integer> s = new HashSet<>();
	void dfs(Tree t, int d) {
		if (t == null) return;
		s.add(d);
		dfs(t.left, d - 1);
		dfs(t.right, d + 1);
	}

	int solve(Tree root) {
		s.clear();
		dfs(root, 0);
		return s.size();
	}


	public static void main(String[] args) {
		Tree root = null;
		Vertical_Lines_in_Binary_Tree tree = new Vertical_Lines_in_Binary_Tree();

		root  = new Tree(20);
		root.left  = new Tree(10);
		root.right  = new Tree(30);
		root.left.left  = new Tree(5);
		root.left.right  = new Tree(15);
		root.right.left  = new Tree(25);
		root.right.right  = new Tree(35);
		root.left.left.left  = new Tree(3);
		root.left.left.right  = new Tree(6);
		root.left.right.left  = new Tree(13);
		root.left.right.right  = new Tree(18);
		root.right.left.left  = new Tree(22);
		root.right.left.right  = new Tree(28);
		root.right.right.left  = new Tree(32);
		root.right.right.right  = new Tree(48);


		int result = tree.solve(root);
		System.out.println(result);
	}
}