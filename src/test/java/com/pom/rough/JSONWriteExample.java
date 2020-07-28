package com.pom.rough;
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class JSONWriteExample
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //First window 
        JSONObject WindowTitle = new JSONObject();
        WindowTitle.put("title", "Sample Konfabulator Widget");
        WindowTitle.put("name", "main_window");
        WindowTitle.put( "width", 500);
        WindowTitle.put( "Height", 500); 
        
        
        JSONObject windowObj = new JSONObject();
        windowObj.put("employee", WindowTitle);
          
        //Add image
        JSONObject imageObj = new JSONObject();               
        imageObj.put("src", "Images/Sun.png");
        imageObj.put("name", "sun1");
        imageObj.put("hOffset",250);
        imageObj.put("vOffset",250);
        imageObj.put( "alignment", "center");
     
          
        JSONObject imagObj = new JSONObject();
        imageObj.put("employee", imageObj);
         
        //Add employees to list
        JSONArray windowtitleList = new JSONArray();
        windowtitleList.add(windowObj);
        windowtitleList.add(imageObj);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {
 
            file.write(windowtitleList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



/*{"widget": {
    "debug": "on",
    "window": {
        "title": "Sample Konfabulator Widget",
        "name": "main_window",
        "width": 500,
        "height": 500
    },
    "image": { 
        "src": "Images/Sun.png",
        "name": "sun1",
        "hOffset": 250,
        "vOffset": 250,
        "alignment": "center"
    },
    "text": {
        "data": "Click Here",
        "size": 36,
        "style": "bold",
        "name": "text1",
        "hOffset": 250,
        "vOffset": 100,
        "alignment": "center",
        "onMouseUp": "sun1.opacity = (sun1.opacity / 100) * 90;"
    }
}}*/