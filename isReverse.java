boolean isReverse(String a, String b){
    if(a.length()!=b.length()){
        return false;
    }
    if(a.length()==0){
        return true;
    }
    if(a.toLowerCase().charAt(0)!=b.toLowerCase().charAt(b.length()-1)){
        return false;
    }
    return isReverse(a.substring(1), b.substring(0,b.length()-1));
}
