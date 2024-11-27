class Solution {
public:
	int findChampion(int n, vector<vector<int>>& edges) {
		 int winners = 0;
		 int windex = 0;
		 vector<int> indegrees(n, 0);

		 for (int i = 0; i < edges.size(); i ++) {
			  indegrees[edges[i][1]] ++;
		 }

		 for (int i = 0; i < indegrees.size(); i ++) {
			  if (indegrees[i] == 0) {
					winners ++;
					windex = i;
			  }

			  if (winners > 1) {
					return -1;
			  }
		 }

		 int solution = winners == 0 ? -1 : windex;

		 return solution;
	}
};
