package _02CucumberDataTable;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class dTableSteps {

    @Given("data table as follows1")
    public void dataTableAsFollows1(DataTable dataTable) {
        List<List<String>> list = dataTable.cells();
        for (List<String> s : list) {
            System.out.println(s);
        }

        System.out.println("-------------");
        System.out.println(dataTable.columns(1,2));
        System.out.println("-------------");
        System.out.println(list.get(0).get(2));
        System.out.println(list.get(1).get(0));

    }

    @Given("data table as follows2")
    public void dataTableAsFollows2(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);

        for (Map.Entry<String, String> e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));

    }

    @Given("data table as follows3")
    public void dataTableAsFollows3(DataTable dataTable) {
        List<Map<String, String>> lists = dataTable.asMaps();

        for (Map<String, String> map : lists) {
            System.out.println(map);
        }

    }

    @Given("data table as follows4")
    public void dataTableAsFollows4(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();
        for (List<String> list : lists) {
            System.out.println(list);
        }

        System.out.println(dataTable);

    }

    @Given("data table as follows5")
    public void dataTableAsFollows5(List<List<String>> lists) {
        for (List<String> list : lists) {
            System.out.println(list);
        }

    }


    public void submitForm(){

    }
}
