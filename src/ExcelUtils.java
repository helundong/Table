import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public  class ExcelUtils {
    public static List<Person> getPerson(String path) throws IOException {
        POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(path));
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        HSSFSheet sheet = wb.getSheetAt(0);
        int rowNum = sheet.getLastRowNum();
        List<Person> list = new ArrayList<>();

        for (int i = 1; i <= rowNum; i++) {
            HSSFRow row = sheet.getRow(i);
            Person person = new Person();
            person.setId(row.getCell(0).getStringCellValue());
            person.setName(row.getCell(1).getStringCellValue());
            person.setGender(row.getCell(2).getStringCellValue());
            person.setBirthday(row.getCell(3).getStringCellValue());
            person.setAge(row.getCell(4).getStringCellValue());
            person.setEthnicity(row.getCell(5).getStringCellValue());
            person.setRelationship(row.getCell(6).getStringCellValue());
            person.setStatus(row.getCell(7).getStringCellValue());
            person.setBuildingNum(row.getCell(8).getStringCellValue());
            person.setBuildingName(row.getCell(9).getStringCellValue());
            person.setRoomNum(row.getCell(10).getStringCellValue());
            person.setVillageName(row.getCell(11).getStringCellValue());
            person.setAddr(row.getCell(12).getStringCellValue());
            person.setPhoneNum(row.getCell(13).getStringCellValue());
            person.setMobilePhoneNum(row.getCell(14).getStringCellValue());
            person.setQuyu(row.getCell(15).getStringCellValue());
            person.setStree(row.getCell(16).getStringCellValue());
            person.setSequ(row.getCell(17).getStringCellValue());
            person.setWangge(row.getCell(18).getStringCellValue());
            person.setUpdateDate(row.getCell(19).getStringCellValue());
            person.setCreatDate(row.getCell(20).getStringCellValue());

            list.add(person);
        }

        return list;
    }


    public static void creatPersonTable (List<Person> list, HSSFWorkbook wbModel, File tableDirct) throws IOException {
        if(!tableDirct.exists()){
            tableDirct.mkdir();
        }

        HSSFSheet sheet = wbModel.getSheetAt(0);
        for (Person person : list){
            String contactInformation;
            if(StringUtils.isNotBlank(person.getMobilePhoneNum())){
                contactInformation = person.getMobilePhoneNum();
            }else if (StringUtils.isNotBlank(person.getPhoneNum())){
                contactInformation = person.getPhoneNum();
            }else{
                contactInformation = "无";
            }
            int rowNum = sheet.getLastRowNum();
            for (int i = 0; i <= rowNum ; i++) {
                HSSFRow row = sheet.getRow(i);
                short cellNum = row.getLastCellNum();
                for (int j = 0; j < cellNum ; j++) {
                    String cellValue = row.getCell(j).getStringCellValue();
                    switch (cellValue){
                        case "姓名":
                            sheet.getRow(i).getCell(j+1).setCellValue(person.getName());
                            break;
                        case "性别":
                            sheet.getRow(i).getCell(j + 1).setCellValue(person.getGender());
                            break;
                        case "所属社区":
                            sheet.getRow(i).getCell(j + 1).setCellValue(person.getSequ());
                            break;
                        case "出生年月":
                            sheet.getRow(i).getCell(j + 1).setCellValue(person.getBirthday());
                            break;
                        case "民族":
                            sheet.getRow(i).getCell(j + 1).setCellValue(person.getEthnicity());
                            break;
                        case "所属网格":
                            sheet.getRow(i).getCell(j + 1).setCellValue(person.getWangge());
                            break;
                        case "婚姻状况":
                            sheet.getRow(i).getCell(j + 1).setCellValue("已婚");
                            break;
                        case "政治面貌":
                            sheet.getRow(i).getCell(j + 1).setCellValue("群众");
                            break;
                        case "宗教信仰":
                            sheet.getRow(i).getCell(j + 1).setCellValue("无");
                            break;
                        case "文化程度":
                            sheet.getRow(i).getCell(j + 1).setCellValue("小学");
                            break;
                        case "联系方式":
                            sheet.getRow(i).getCell(j + 1).setCellValue(contactInformation);
                            break;
                        case "身份证号码":
                            sheet.getRow(i).getCell(j + 1).setCellValue(person.getId());
                            break;
                        case "户籍地址":
                            sheet.getRow(i).getCell(j + 1).setCellValue(person.getAddr());
                            break;
                    }

                }


            }

            StringBuilder filePath = new StringBuilder(tableDirct.getPath());
            filePath.append("\\");
            filePath.append(person.getName());
            filePath.append(StringUtils.substring(person.getId(),person.getId().length()-4));
            filePath.append(".xls");

            wbModel.write(new File(filePath.toString()));

        }

    }
}
