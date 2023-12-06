package com.smelnyk.db;

import com.smelnyk.db.models.Base;
import com.smelnyk.db.models.Table;
import com.smelnyk.db.models.Type;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.*;


public class DatabaseTests {
    private static Base base;

    @BeforeClass
    public static void init() throws Exception {
        base = new Base("base");
        File file = new File(DatabaseTests.class.getResource("/databases/" + base.getName() + ".json").getFile());
        base.loadDataFromFile(file);
    }

    @Test
    public void addTableTest() throws Exception {
        List<String> columns = new ArrayList<>();
        columns.add("name");
        columns.add("grade");
        columns.add("complexint");

        List<Type> types = new ArrayList<>();
        types.add(Type.STRING);
        types.add(Type.INTEGER);
        types.add(Type.COMPLEXINTEGER);

        Table table = base.findTableByName("students");
        Assert.assertNull(table);

        base.addTable("students", columns, types);
        table = base.findTableByName("students");
        Assert.assertNotNull(table);
        Assert.assertEquals(3, table.getAttributes().size());
    }

    @Test
    public void sortByFieldTest(){
        Table table = base.findTableByName("students");
        table.getRows().clear();
        table.addRow(Arrays.asList("Sonya", 3, "1+3i"));
        table.addRow(Arrays.asList("Diana", 10, "20+1i"));
        table.addRow(Arrays.asList("Alina", 1,  "0"));
        Integer lastIndex = table.getLastRowId();
        Assert.assertEquals("3", lastIndex.toString());
        table.sortByField(1);
        lastIndex = table.getLastRowId();
        Assert.assertEquals("2", lastIndex.toString());
    }

    @Test
    public void saveTable() throws Exception {
        Base copy = new Base(base.getName() + "_copy");
        copy.setTables(base.getTables());
        copy.saveToFile(new File(getClass().getResource("/databases").getFile()));

        Base copyLoaded = new Base(copy.getName());
        copyLoaded.loadDataFromFile(new File(getClass().getResource(
                "/databases/" + copyLoaded.getName() + ".json").getFile())
        );

        Assert.assertEquals(copy, copyLoaded);
    }
}