class Solution {
public:
    int countDays(int days, vector<vector<int>>& meetings) {
        if (meetings.empty()) return days; // If no meetings, all days are free
        
        sort(meetings.begin(), meetings.end()); // Sort meetings by start day
        
        int n = meetings.size();
        int ans = meetings[0][0] - 1; // Free days before the first meeting
        int mx = meetings[0][1]; // Last occupied day
        
        for (int i = 1; i < n; i++) {
            if (mx < meetings[i][0]) ans += meetings[i][0] - mx - 1; // Count gaps
            mx = max(meetings[i][1], mx); // Update last occupied day
        }
        
        if (mx < days) ans += days - mx; // Free days after the last meeting
        return ans;
    }
};