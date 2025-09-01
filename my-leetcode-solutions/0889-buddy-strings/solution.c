bool buddyStrings(char * s, char * goal){
    int len_s = strlen(s);
    int len_goal = strlen(goal);

    // If lengths are different, a swap cannot make them equal.
    if (len_s != len_goal) {
        return false;
    }

    // Case 1: s and goal are identical.
    // We can swap two identical characters if there are duplicates in s.
    if (strcmp(s, goal) == 0) {
        int counts[26] = {0}; // To store character frequencies
        for (int i = 0; i < len_s; i++) {
            counts[s[i] - 'a']++;
            if (counts[s[i] - 'a'] > 1) {
                return true; // Found a duplicate character, can swap it with itself.
            }
        }
        return false; // No duplicate characters, cannot perform a meaningful swap.
    }

    // Case 2: s and goal are different.
    // Find differing indices.
    int diff_indices[2];
    int diff_count = 0;

    for (int i = 0; i < len_s; i++) {
        if (s[i] != goal[i]) {
            if (diff_count < 2) {
                diff_indices[diff_count] = i;
            }
            diff_count++;
        }
    }

    // If more than two differences, or less than two differences (and not Case 1),
    // a single swap cannot make them equal.
    if (diff_count != 2) {
        return false;
    }

    // Check if swapping the characters at the two differing indices in 's'
    // results in 'goal'.
    return (s[diff_indices[0]] == goal[diff_indices[1]] &&
            s[diff_indices[1]] == goal[diff_indices[0]]);
}
