// { autofold
package com.yourself;



import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DoNotUseNull {
// }

    private String name = StringUtils.EMPTY;

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    private List<String> nameList = new ArrayList<>();

    public void dealWithEmptyList(){
        for(String name: nameList){
            System.out.println(name);
        }
    }

    public String dealWithEmptyString(){
        return name.toUpperCase();
    }


}