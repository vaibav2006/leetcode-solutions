int maxProfit(int* arr, int n) {
    int minPrice = arr[0];
    int maxProfit = 0;

    for (int i = 1; i < n; i++) {
        if (arr[i] < minPrice) {
            minPrice = arr[i];
        } else if (arr[i] - minPrice > maxProfit) {
            maxProfit = arr[i] - minPrice;
        }
    }

    return maxProfit;
}
