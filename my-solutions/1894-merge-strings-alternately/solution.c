char * mergeAlternately(char * word1, char * word2){
    int len1 = strlen(word1);
    int len2 = strlen(word2);
    int size = len1 + len2+1;

    char* result = malloc(size * sizeof(char));
    int pr = 0, pw = 0;

    while (pw < len1 || pw < len2){
        if (pw < len1){
            result[pr] = word1[pw];
            pr++;
        }
        if (pw < len2){
            result[pr] = word2[pw];
            pr++;
        }
        pw++;
    }
result[pr] = '\0';
return result;
}
