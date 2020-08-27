#define INPUT_OUTPUT { \
	freopen("input.txt", "r", stdin); \
	freopen("output.txt", "w", stdout);\
}

// CPP PROGRAM STARTS HERE
#include<stdio.h>
#include<iostream>
#include<vector>
#include<algorithm>
#include<set>
#include<map>
#include<climits>
using namespace std;

// Compartor for sorting in reverse order
bool OverloadedCompratorFunction(int x, int y) {
	return x > y;
}

void vectorDemo() {
	vector<int> v = {12, 23, 13, 34, 25};

	cout << v[1] << endl; // access second index element

	sort(v.begin(), v.end()); // sort vector inorder in O(NlogN)
	for (int i : v) {
		cout << i << " ";
	}

	// Search item using binary search in O(logN)
	bool isAvail = binary_search(v.begin(), v.end(), 13);
	if (isAvail) {
		cout << endl << "Item found" << endl;
	} else {
		cout << endl << "Item not found" << endl;
	}

	// Insert item into vector
	v.push_back(47);
	v.push_back(47);
	v.push_back(47);
	v.push_back(47);

	v.push_back(60);
	v.push_back(70);
	for (int i : v) {
		cout << i << " ";
	}

	// Now finding first occurrence of 27 in vector using iterator
	vector<int>::iterator itr1 = lower_bound(v.begin(), v.end(), 47); //>=
	// Now finding last occurrence of 27 in vector using auto
	auto itr2 = upper_bound(v.begin(), v.end(), 47); // <

	cout << "First occurrence: " << *itr1 << endl;
	cout << "Last occurrence: " << *itr2 << endl;

	// count how many times 47 occur in vector
	cout << "No. of occurrence: " << itr2 - itr1 << endl;

	// Sort vector in reverse order
	sort(v.begin(), v.end(), OverloadedCompratorFunction);

	vector<int>::iterator itr3; // print vector
	for (itr3 = v.begin(); itr3 != v.end(); itr3++) {
		cout << *itr3 << " ";
	}
	cout << endl;

	// Iterate by reference and it also change vector item value by 1.
	for (int &x : v) {
		x++;
		cout << x << " ";
	}
	cout << endl;
}


void setDemo() {
	set<int> s;
	s.insert(5);
	s.insert(12);
	s.insert(-4);
	s.insert(7);
	s.insert(-10);

	for (int x : s) {
		cout << x << " ";
	}
	cout << endl;

	auto itr1 = s.find(-4); // check -4 present or not
	if (itr1 != s.end()) {
		cout << *itr1 << " found" << endl;
	} else {
		cout << *itr1 << " not foound" << endl;
	}

	// Finding lower bound
	auto itr2 = s.lower_bound(-1);
	auto itr3 = s.upper_bound(-1);
	cout << "Lower bound " << *itr2 << endl;
	cout << "Upper bound " << *itr3 << endl;

	// When upper bound of any item not found
	auto itr4 = s.upper_bound(12);
	if (itr4 == s.end()) {
		cout << "opos! sorry can't find something like this." << endl;
	}

}




void mapDemo() {
	// map with int to int
	map<int, int> m;
	m[1] = 100;
	m[2] = -1;
	m[3] = 200;
	m[100000232] = 1;

	// map with char to int
	map<char, int> cnt;
	string x = "Deepak Jaiswal";

	for (char c : x) {
		cnt[c]++;
	}

	cout << "a occur: " << cnt['a'] << " times & e occur: " << cnt['e'] << " times" << endl;
}


void powerOfStl() {
	/* The question is:
	Add the interval 2 to 3, 10 to 20, 30 to 400 and 401 to
	 450.Then Give the interval which contains the point 13.

	Constraint: add function will always be something which
	is not overlapped with previous intervals or gets merge.
	for example: id we add [399, 450] which generate overlap. */

	set < pair<int, int> >  s;
	s.insert({401, 450}); // here insertion may be any order(random or inorder).
	s.insert({10, 20});
	s.insert({2, 3});
	s.insert({30, 400});

	// The set pair element look like coz set always in sorted order
	// 2,3
	// 10,20
	// 30,400
	// 401,450


	/* Now validating the inserted pair:
	Pair {a, b} is smaller than Pair {c, d}.
	iff (a < b) or (a == b and c < d) */
	// Note: In pairs only x coordinate varies,y coordinate remain same.

	//Generate a pair with the help of upper bound:
	// {12, ?} // coz 12 is less than 30 that's why we used 12 here.

	int point = 12; // say

	auto itr = s.upper_bound({point, INT_MAX}); // perform upper bound with passing in pair of integer
	if (itr == s.end()) {
		cout << "The given point is not lying in any interval..." << endl;
		return;
	}

	itr--; // go one step back
	pair<int, int> current = *itr;
	if (current.first <= point && point <= current.second) {
		cout << "Yes, it's present: [" << current.first << ", " << current.second << "]" << endl;
	} else {
		cout << "The given point is not lying in any interval..." << endl;
	}
}


signed main() {
	INPUT_OUTPUT; // HANDLING INPUT OUTPUT

	// vectorDemo();
	//setDemo();
	//mapDemo();

	powerOfStl();

	return 0;
}