class Solution {
public:
    int findChampion(int n, vector<vector<int>>& edges) {
        int winners = 0; // Record how many winners there are
        int windex = 0; // Record the winners index
        vector<int> indegrees(n, 0); // Track node indegrees

        // Record all nodes with indegrees (losers)
        for (int i = 0; i < edges.size(); i ++) {
            indegrees[edges[i][1]] ++;
        }

        // Record which nodes have no indegrees (winners)
        for (int i = 0; i < indegrees.size(); i ++) {
            if (indegrees[i] == 0) {
                winners ++;
                windex = i;
            }

            // Cut short if multiple winners/tie, based on problem specification
            if (winners > 1) {
                return -1;
            }
        }

        // If we made it this far, there's only one winner
        return windex;
    }
};
