import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel
{
    @Test
    public void ReadExcel() throws Exception {
        try {
            FileInputStream fi= new FileInputStream("/Users/parvez/IdeaProjects/FirstDemoProject/src/Data/CustData.xlsx");
            Workbook book= WorkbookFactory.create(fi);
            Sheet st=book.getSheet("Sheet1");
            Object[][] data=new Object[st.getLastRowNum()][st.getRow(0).getLastCellNum()];
            for(int i=0;i<st.getLastRowNum();i++){
                for(int k=0;k<st.getRow(0).getLastCellNum();k++){
                    data[i][k]=st.getRow(i+1).getCell(k).toString();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
