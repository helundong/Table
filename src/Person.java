public class Person {
    private String id;
    private String name;
    private String gender;
    private String birthday;
    private String age;
    private String ethnicity;
    private String relationship;
    private String status;
    private String buildingNum;
    private String buildingName;
    private String roomNum;
    private String villageName;
    private String addr;
    private String phoneNum;
    private String MobilePhoneNum;
    private String quyu;
    private String stree;
    private String sequ;
    private String wangge;
    private String updateDate;

    public String getMobilePhoneNum() {
        return MobilePhoneNum;
    }

    public void setMobilePhoneNum(String mobilePhoneNum) {
        MobilePhoneNum = mobilePhoneNum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age='" + age + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", relationship='" + relationship + '\'' +
                ", status='" + status + '\'' +
                ", buildingNum='" + buildingNum + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", roomNum='" + roomNum + '\'' +
                ", villageName='" + villageName + '\'' +
                ", addr='" + addr + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", MobilePhoneNum='" + MobilePhoneNum + '\'' +
                ", quyu='" + quyu + '\'' +
                ", stree='" + stree + '\'' +
                ", sequ='" + sequ + '\'' +
                ", wangge='" + wangge + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", creatDate='" + creatDate + '\'' +
                '}';
    }


    private String creatDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getQuyu() {
        return quyu;
    }

    public void setQuyu(String quyu) {
        this.quyu = quyu;
    }

    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }

    public String getSequ() {
        return sequ;
    }

    public void setSequ(String sequ) {
        this.sequ = sequ;
    }

    public String getWangge() {
        return wangge;
    }

    public void setWangge(String wangge) {
        this.wangge = wangge;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }
}
