package com.data;


import com.data.entity.JDBCInfo;
import com.data.service.serviceAskTreeData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class jsonTests {
    public static StringBuffer ab;

    @Test
    public void testfunc() {
//        String a = "{\"url\":\"jdbc:mysql://localhost:3306/\",\"dbname\":\"zhssjj\",\"parameter\":\"?serverTimezone=UTC\",\"username\":\"root\",\"password\":\"root\",\"sql\":\"select * from people\"}";
//        String a = "{\"url\":\"jdbc:mysql://139.129.67.219:3306/\",\"dbname\":\"zhssjj\",\"parameter\":\"?serverTimezone=UTC\",\"username\":\"root\",\"password\":\"123456a?\",\"sql\":\"select * from channel\"}";
        String a="{\"servicename\":\"219\",\"url\":\"jdbc:mysql://139.129.67.219:3306/\",\"dbname\":\"czscaq\",\"parameter\":\"?serverTimezone=UTC\",\"username\":\"zhsdevelop\",\"password\":\"southnet\",\"sql\":\"select * from gkml_classify\"}";
        serviceAskTreeData aaaa = new serviceAskTreeData();
        String s = aaaa.dealTreedataRequest(a);
        System.out.println(s);
    }


    @Test
    public void testsb() {
        ab = new StringBuffer();
        ab.append("aaaa");
        System.out.println(ab.toString());
        testsb_2();
        System.out.println(ab.toString());
    }

    public void testsb_2() {
        ab.append("333333333333333");
    }

    public void spljsons() {

    }

}
