package org.example.features.textblock;

public class TextBlock {
    public static void main(String[] args) {
        //Old ways of creating a text blocks by "
        String json = "{\n" +
                "\"employees\":[\n" +
                "    {\"firstName\":\"John\", \"lastName\":\"Doe\"},\n" +
                "    {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\n" +
                "    {\"firstName\":\"Peter\", \"lastName\":\"Jones\"}\n" +
                "]\n" +
                "}";
        //New way of Creating a text blocks by """
        String newJson = """
                {
                "employees":[
                    {"firstName":"John", "lastName":"Doe"},
                    {"firstName":"Anna", "lastName":"Smith"},
                    {"firstName":"Peter", "lastName":"Jones"}
                ]
                }""";
        //It preserves the formatting :)
        System.out.println(json);
        System.out.println(newJson);
    }
}
