int climbStairs(int n) {
    int tab[n+1];
    if (n >= 0) tab[0] = 1;
    if (n >= 1) tab[1] = 1;
    for (int i = 2; i <= n; i++) 
        tab[i] = tab[i-1] + tab[i-2];
    return tab[n];
}
