public String removeAllInstances(String modify, String removeable){
        if(modify.indexOf(removeable) == -1){
            return modify;
        }
        else{
            String firstHalf = modify.substring(0, modify.indexOf(removeable));
            String secondHalf = modify.substring(firstHalf.length() + removeable.length());
            modify = firstHalf + secondHalf;
                if(modify.indexOf(removeable) == -1){
                    return modify;
                }
                else{
                    return this.removeAllInstances(modify, removeable);
                }
        }
    }
