package com.zym.springcloud;

import cn.hutool.core.collection.ListUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.util.CollectionUtils;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static void main(String[] args) {
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println(zonedDateTime);
        List<Object> heroItemList = new ArrayList<Object>();
        List<Object> gobeItemList = new ArrayList<Object>();
        Boolean bool = false;
        addItemList(heroItemList, bool);
        addItemList(gobeItemList, bool);

    }
    private static void addItemList(List<Object> heroItemList, Boolean bool) {
        if (CollectionUtils.isEmpty(heroItemList)) {
            heroItemList.add(bool);
        }
        heroItemList.add(!bool);
    }


}
