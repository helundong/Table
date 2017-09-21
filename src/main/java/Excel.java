
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Excel {

    public static void main(String[] args) throws IOException {


        POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("D:\\model.xls"));
        HSSFWorkbook wbModel = new HSSFWorkbook(fs);
        File tableDirct = new File("D:\\table");
        List<Person> list = ExcelUtils.getPerson("D:\\data.xls");
        ExcelUtils.creatPersonTable(list, wbModel, tableDirct);

    }
}
