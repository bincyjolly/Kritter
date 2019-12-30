package com.kritter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.context.Context;


import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String args[]) throws Exception {

        VelocityEngine ve = new VelocityEngine();
        ve.init();

        ArrayList list = new ArrayList();

        Map map = new HashMap();
        map.put("rno", "1");
        map.put("name", "Komal");
        map.put("cla", "Bca");
        list.add(map);

        map = new HashMap();
        map.put("rno", "2");
        map.put("name", "Komal");
        map.put("cla", "Bca");
        list.add(map);

        VelocityContext conte = new VelocityContext();
        conte.put("stuDetails", list);
        conte.put("Name", new Student());

        Template t = ve.getTemplate("./src/main/resources/Stu.vm");
        StringWriter writer = new StringWriter();
        t.merge(conte, writer);

        System.out.println(writer);
    }
}
