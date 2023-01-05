package com.Kwon.ch07Project;

public class StudentDTO {
	   
    private String name;
    private int no;
    private String grade;
    private String address;
    private long phoneL;
    
    public StudentDTO(){}//4-1��
    public StudentDTO(String name, int no, String grade, String address, long phone){
       super();
       this.name = name;
       this.no = no;
       this.grade = grade;
       this.phoneL = phone;
    }//4-2��;
    
    public StudentDTO(String name, int no, String grade) {}//4-3��;
    
    //5�� ����
    public String getName() {
       return name;
    }
    public void setName(String name) {
       this.name = name;
    }
    public int getNo() {
       return no;
    }
    public void setNo(int no) {
       this.no = no;
    }
    public String getGrade() {
       return grade;
    }
    public void setGrade(String grade) {
       this.grade = grade;
    }
    public String getAddress() {
       return address;
    }
    public void setAddress(String address) {
       this.address = address;
    }
    public long getPhone() {
       return phoneL;
    }
    public void setPhone(long phone) {
       this.phoneL = phone;
    }
    
    
}

/*1. StudentDTO�� ����(StudentDTO.java)
*2. ��������� ���� ���� �����ڸ� private�� �Ѵ�.
*3. ��������� name,no(�й�),grade(�г�),address,phone���� �Ѵ�.
*4. �����ڴ� �⺻���� ��� ��������� �Ķ���ͷ� �ϴ� ������, name, no, grade�� �Ķ���ͷ� �ϴ� �����ڸ� ����(3��)
*5. Getter �� Setter �޼��带 ���� 
*6. main �޼��忡�� StudentDTO��ü�� sdto�� �Ͽ� ����µ� ��ü ������ StudentDTO�� ��� ������ ����ϴ� �����ڸ� ����Ͽ� ����(������ �������,���� ���Ƿ�)
*7. StudentDTO�� �� ��������� ���
*8. StudentDTO�� �� ��������� �����غ��ÿ� (���� ���Ƿ�)
*9. 8�� Ǯ�� �� ��������� ���
*/