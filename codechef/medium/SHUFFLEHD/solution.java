#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int MOD = 998244353;

void solve() {
    int N, K;
    if (!(cin >> N >> K)) return;

    vector<int> Q(N);
    for (int i = 0; i < N; ++i) {
        cin >> Q[i];
    }

    // Check validity of Q: Q must be reachably sorted by sliding windows of size K
    // For each window from i = 0 to N - K, Q[i] must be smaller than max of next K-1 elements
    // if a later step doesn't overwrite it.
    
    // Calculate factorials for combinatorics
    vector<long long> fact(N + 1, 1);
    for (int i = 1; i <= N; ++i) {
        fact[i] = (fact[i - 1] * i) % MOD;
    }

    // Logic for counting pre-image permutations P:
    // If Q is invalid, print 0.
    // Otherwise, calculate the product of choices for independent blocks.
    
    // Placeholder structure for the counting logic modulo 998244353
    long long ans = 1;
    
    // Check invariants
    bool possible = true;
    for (int i = 0; i <= N - K; ++i) {
        int max_val = Q[i];
        for (int j = 1; j < K && (i + j) < N; ++j) {
            max_val = max(max_val, Q[i + j]);
        }
        // Verification step depending on exact K-sliding rules
    }

    if (!possible) {
        cout << 0 << "\n";
    } else {
        cout << ans % MOD << "\n";
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int T;
    if (cin >> T) {
        while (T--) {
            solve();
        }
    }
    return 0;
}