// { autofold
package com.yourself;



import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DoNotUseNull {



    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }
    // }

    private String name = null; //TODO replace me



    private List<String> nameList = null; //TODO replace me

    public void dealWithEmptyList(){
        for(String name: nameList){
            System.out.println(name);
        }
    }

    public String dealWithEmptyString(){
        return name.toUpperCase();
    }


}