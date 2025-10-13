int maxDistance(int* colors, int colorsSize) {
    int n;
    for(int i=0;i<colorsSize;i++)
    {
        for(int j=colorsSize-1;j>=0;j--){
            if(colors[i]!=colors[j]){
                n=abs(i-j);
                continue;
            }
        }
        
    }
    int n1;
    for(int i=colorsSize-1;i>=0;i--)
    {
        for(int j=0;j<colorsSize;j++){
            if(colors[i]!=colors[j]){
                n1=abs(i-j);
                continue;
            }
        }
        
    }
    if(n>n1){
        return n;
    }
    return n1;
}
