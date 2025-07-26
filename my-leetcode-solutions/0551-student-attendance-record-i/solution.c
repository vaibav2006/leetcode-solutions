bool checkRecord(char* s) {
    int size=strlen(s),al=0,l=0;
    for(int i=0;i<size;i++){
        if(s[i]=='A'){
            al++;
        }
        if(s[i]=='L' && s[i+1]=='L' && s[i+2]=='L'){
            l=1;
        }
    }
    if(al>=2){
        return false;
    }
    if(l==1){
        return false;
    }
   return true;
}
